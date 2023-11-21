package week7.patikaClone.View;

import week7.patikaClone.Helper.Contanst;
import week7.patikaClone.Helper.Helper;
import week7.patikaClone.Model.*;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class OperatorGUI extends JFrame {
    private JPanel wrapper;
    private JTabbedPane pnl_course_list;
    private JLabel lbl_welcome;
    private JPanel pnl_top;
    private JButton btn_logout;
    private JPanel pnl_user_list;
    private JScrollPane scrl_user_list;
    private JTable tbl_user_list;
    private JPanel pnl_user_form;
    private JTextField field_username;
    private JPasswordField field_user_password;
    private JTextField field_user_name;
    private JComboBox cbmb_user_type;
    private JButton btn_user_add;
    private JTextField field_user_id;
    private JButton btn_user_delete;
    private JTextField fld_search_user_name;
    private JTextField fld_search_username;
    private JComboBox cmb_search_user_type;
    private JButton btn_user_search;
    private JPanel pnl_patika_list;
    private JScrollPane scrl_patika_lsit;
    private JTable tbl_patika_list;
    private JPanel pnl_patika_add;
    private JTextField fld_patika_name;
    private JButton btn_patika_add;
    private JLabel fld_app_version;
    private JPanel pnl_user_top;
    private JScrollPane scrl_course_list;
    private JTable tbl_course_list;
    private JPanel pnl_course_add;
    private JTextField fld_course_name;
    private JTextField fld_course_lang;
    private JComboBox cmb_course_patika;
    private JComboBox cmb_course_user;
    private JButton btn_course_add;
    private DefaultTableModel mdl_user_list;
    private Object[] row_user_list;
    private final Operator operator;
    private DefaultTableModel mdl_patika_list;
    private Object[] row_patika_list;
    private JPopupMenu patikaMenu;
    private DefaultTableModel mdl_course_list;
    private Object[] row_course_list;

    public OperatorGUI(Operator operator) {
        this.operator = operator;
        add(wrapper);
        setSize(800, 600);
        setLocation(Helper.screenCenter("x", getSize().width), Helper.screenCenter("y", getSize().height));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Contanst.APP_NAME + " - Operator Panel");
        setVisible(true);
        lbl_welcome.setText("Hosgeldiniz " + operator.getName());
        fld_app_version.setText(Contanst.APP_VERSION);


        //Model for user list
        mdl_user_list = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0) {
                    return false;//This causes all cells to be not editable
                }
                return true;
            }
        };

        Object[] col_user_list = {"ID", "Ad Soyad", "Kullanici Adi", "Sifre", "Tip"};
        mdl_user_list.setColumnIdentifiers(col_user_list);
        Object[] row_user_list = new Object[col_user_list.length];
//        row_user_list[0] = operator.getId();
//        row_user_list[1] = operator.getName();
//        row_user_list[2] = operator.getUsername();
//        row_user_list[3] = operator.getPassword();
//        row_user_list[4] = operator.getType();
//        mdl_user_list.addColumn(row_user_list);
        addTableList(row_user_list);
        tbl_user_list.setModel(mdl_user_list);
        tbl_user_list.getTableHeader().setReorderingAllowed(false);
        tbl_user_list.getColumnModel().getColumn(0).setMinWidth(25);
        for (int i = 1; i < tbl_user_list.getColumnCount(); i++) {
            tbl_user_list.getColumnModel().getColumn(i).setMinWidth(100);
        }


        tbl_user_list.getSelectionModel().addListSelectionListener(e -> {
            try {
                String selectedData = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(), 0).toString();
                field_user_id.setText(selectedData);
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        });

        tbl_user_list.getModel().addTableModelListener(e -> {
            try {
                if (e.getType() == TableModelEvent.UPDATE) {
                    String user_name, user_username, user_password, user_type;
                    user_name = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(), 1).toString();
                    user_username = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(), 2).toString();
                    user_password = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(), 3).toString();
                    user_type = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(), 4).toString();
                    int user_id = Integer.parseInt(tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(), 0).toString());
                    User user = new User(user_id, user_name, user_username, user_password, user_type);
                    if (User.update(user)) {
                        Helper.showMessage("Kullanici guncellendi", "BILGI", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("User update");
                        addTableList(row_user_list);
                        loadUserComboBox();
                    } else {
                        addTableList(row_user_list);
                    }
                    loadUserComboBox();
                    loadPatikaList();
                }
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        });

        //Model for patika list
        patikaMenu = new JPopupMenu();
        JMenuItem updatePatika = new JMenuItem("Guncelle");
        JMenuItem deletePatika = new JMenuItem("Sil");
        patikaMenu.add(updatePatika);
        patikaMenu.add(deletePatika);
        updatePatika.addActionListener(e -> {
            int selectedRow = tbl_patika_list.getSelectedRow();
            int id = Integer.parseInt(tbl_patika_list.getValueAt(selectedRow, 0).toString());
            UpdatePatika updatePatikaGUI = new UpdatePatika(Patika.getFetch(id));
            updatePatikaGUI.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    loadPatikaList();
                    loadPatikaComboBox();
                }
            });

        });
        deletePatika.addActionListener(e -> {
            if (Helper.confirm("Emin misiniz?", "UYARI")) {
                int selectedRow = tbl_patika_list.getSelectedRow();
                int id = Integer.parseInt(tbl_patika_list.getValueAt(selectedRow, 0).toString());
                if (Patika.delete(id)) {
                    Helper.showMessage("Patika silindi", "BILGI", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Patika delete");
                    loadPatikaList();
                    loadPatikaComboBox();
                } else {
                    Helper.showMessage("Patika silinemedi", "UYARI", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        mdl_patika_list = new DefaultTableModel();
        Object[] col_patika_list = {"ID", "Patika Adi"};
        mdl_patika_list.setColumnIdentifiers(col_patika_list);
        row_patika_list = new Object[col_patika_list.length];
        loadPatikaList();
        tbl_patika_list.setModel(mdl_patika_list);
        tbl_patika_list.setComponentPopupMenu(patikaMenu);
        tbl_patika_list.getTableHeader().setReorderingAllowed(false);
        tbl_patika_list.getColumnModel().getColumn(0).setMaxWidth(120);
        tbl_patika_list.getColumnModel().getColumn(0).setMinWidth(25);

        tbl_patika_list.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse Pressed");
                Point point = e.getPoint();
                int selectedRow = tbl_patika_list.rowAtPoint(point);
                tbl_patika_list.setRowSelectionInterval(selectedRow, selectedRow);

            }
        });
        //Model for patika list
        //Model for course list

        mdl_course_list = new DefaultTableModel();
        Object[] col_course_list = {"ID", "Ders Adi", "Dil","Patika", "Egitmen"};
        mdl_course_list.setColumnIdentifiers(col_course_list);
        row_course_list = new Object[col_course_list.length==5?col_course_list.length:5];
        loadCourseModel();
        tbl_course_list.setModel(mdl_course_list);
        tbl_course_list.getTableHeader().setReorderingAllowed(false);
        for (int i = 1; i < tbl_course_list.getColumnCount(); i++) {
            tbl_course_list.getColumnModel().getColumn(i).setMinWidth(75);
        }
        loadPatikaComboBox();
        loadUserComboBox();

        //Model for course list
        btn_user_add.addActionListener(e -> {
            if (Helper.isFieldEmpty(field_user_name) || Helper.isFieldEmpty(field_user_password) || Helper.isFieldEmpty(field_username)) {
                Helper.showMessage("Lutfen tum alanlari doldurunuz", "UYARI", JOptionPane.ERROR_MESSAGE);
            } else {
                String name = field_user_name.getText();
                String username = field_username.getText();
                String password = field_user_password.getText();
                String type = cbmb_user_type.getSelectedItem().toString();
                if (User.add(name, username, password, type)) {
                    Helper.showMessage("Kullanici eklendi", "BILGI", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("User add");
                    addTableList(row_user_list);
                    field_user_password.setText(null);
                    field_user_name.setText(null);
                    field_username.setText(null);
                }
                loadUserComboBox();

            }
        });
        btn_user_delete.addActionListener(e -> {
            if (Helper.isFieldEmpty(field_user_id)) {
                Helper.showMessage("Lutfen ID giriniz", "UYARI", JOptionPane.ERROR_MESSAGE);
            } else {
                if (Helper.confirm("Emin misiniz?", "UYARI")) {
                    int id = Integer.parseInt(field_user_id.getText());
                    if (User.delete(id)) {
                        Helper.showMessage("Kullanici silindi", "BILGI", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("User delete");
                        addTableList(row_user_list);
                        field_user_id.setText(null);
                        loadUserComboBox();
                    } else {
                        Helper.showMessage("Kullanici silinemedi", "UYARI", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

        });
        btn_user_search.addActionListener(e -> {
            String name = fld_search_user_name.getText();
            String username = fld_search_username.getText();
            String type = cmb_search_user_type.getSelectedItem().toString();
            System.out.println(name + " " + username + " " + type);
            addTableList(User.search(name, username, type));
            System.out.println("User search");
        });
        btn_logout.addActionListener(e -> {
            dispose();

        });
        btn_patika_add.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_patika_name)) {
                Helper.showMessage("Lutfen tum alanlari doldurunuz", "UYARI", JOptionPane.ERROR_MESSAGE);
            } else {
                String name = fld_patika_name.getText();
                if (Patika.addPatika(name)) {
                    Helper.showMessage("Patika eklendi", "BILGI", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Patika add");
                    loadPatikaList();
                    loadPatikaComboBox();
                    fld_patika_name.setText(null);
                } else {
                    Helper.showMessage("Patika eklenemedi", "UYARI", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btn_course_add.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_course_name) || Helper.isFieldEmpty(fld_course_lang)) {
                Helper.showMessage("Lutfen tum alanlari doldurunuz", "UYARI", JOptionPane.ERROR_MESSAGE);
            } else {
                Item patikaItem = (Item) cmb_course_patika.getSelectedItem();
                Item userItem = (Item) cmb_course_user.getSelectedItem();
                //Hatali bir patika veya egitmen secimi yapildiginda patikaItem veya userItem null olacaktir
                //Bu yuzden null kontrolu yapmaliyiz


                if (Course.add(patikaItem.getKey(),userItem.getKey(),  fld_course_name.getText(), fld_course_lang.getText())) {
                    Helper.showMessage("Ders eklendi", "BILGI", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Course add");
                    loadCourseModel();
                    fld_course_name.setText(null);
                    fld_course_lang.setText(null);

                }
            }
        });
    }

    private void loadCourseModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_course_list.getModel();
        clearModel.setRowCount(0);
        int i;
        System.out.println("Course List");
        for (Course obj : Course.getList()) {
            i = 0;
            row_course_list[i++] = obj.getId();
            row_course_list[i++] = obj.getName();
            row_course_list[i++] = obj.getLanguage();
            row_course_list[i++] = obj.getPatika().getName();
            row_course_list[i++] = obj.getEducator().getName();
            mdl_course_list.addRow(row_course_list);
        }
    }

    private void loadPatikaList() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_patika_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (Patika patika : Patika.getList()) {
            i = 0;
            row_patika_list[i++] = patika.getId();
            row_patika_list[i++] = patika.getName();
            mdl_patika_list.addRow(row_patika_list);
        }
    }

    private void addTableList(Object[] row_user_list) {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_user_list.getModel();
        clearModel.setRowCount(0);
        for (User user : User.getList()) {
            int i = 0;
            row_user_list[i++] = user.getId();
            row_user_list[i++] = user.getName();
            row_user_list[i++] = user.getUsername();
            row_user_list[i++] = user.getPassword();
            row_user_list[i++] = user.getType();
            mdl_user_list.addRow(row_user_list);
        }
    }

    private void addTableList(ArrayList<User> userArrayList) {
        System.out.println("Search Start");
        try {
            DefaultTableModel clearModel = (DefaultTableModel) tbl_user_list.getModel();
            clearModel.setRowCount(0);

            for (User user : userArrayList) {
                int i = 0; // Reset i for each user
                Object[] row_user_list = new Object[userArrayList.size() == 5 ? userArrayList.size() : 5]; // Create a new row array for each user
                row_user_list[i++] = user.getId();
                row_user_list[i++] = user.getName();
                row_user_list[i++] = user.getUsername();
                row_user_list[i++] = user.getPassword();
                row_user_list[i++] = user.getType();

                mdl_user_list.addRow(row_user_list);
            }
            System.out.println("For End");
        } catch (Exception e) {
            System.out.println("Search Error");
            System.out.println(e.getMessage());
        }
    }

    public void loadPatikaComboBox() {
        cmb_course_patika.removeAllItems();
        for (Patika patika : Patika.getList()) {
            cmb_course_patika.addItem(new Item(patika.getId(), patika.getName()));
        }
    }

    public void loadUserComboBox() {
        cmb_course_user.removeAllItems();
        for (User user : User.getList()) {
            if (user.getType().equals("educator")) {
                cmb_course_user.addItem(new Item(user.getId(), user.getName()));
            }
        }
    }

    public static void main(String[] args) {
        Helper.setLayout();
        Operator op = new Operator();
        op.setId(1);
        op.setName("Baris Karapelit");
        op.setUsername("bariskarapelit");
        op.setPassword("123456");
        op.setType("operator");
        OperatorGUI operatorGUI = new OperatorGUI(op);
    }
}
