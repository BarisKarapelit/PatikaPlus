package week7.patikaClone.View;

import week7.patikaClone.Helper.Contanst;
import week7.patikaClone.Helper.Helper;
import week7.patikaClone.Model.Operator;
import week7.patikaClone.Model.User;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OperatorGUI extends JFrame {
    private JPanel wrapper;
    private JTabbedPane tab_operator;
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
    private DefaultTableModel mdl_user_list;
    private Object[] row_user_list;
    private final Operator operator;

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
                    } else {
                        addTableList(row_user_list);
                    }
                }
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        });

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

            }
        });
        btn_user_delete.addActionListener(e -> {
            if (Helper.isFieldEmpty(field_user_id)) {
                Helper.showMessage("Lutfen ID giriniz", "UYARI", JOptionPane.ERROR_MESSAGE);
            } else {
                int id = Integer.parseInt(field_user_id.getText());
                if (User.delete(id)) {
                    Helper.showMessage("Kullanici silindi", "BILGI", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("User delete");
                    addTableList(row_user_list);
                    field_user_id.setText(null);
                } else {
                    Helper.showMessage("Kullanici silinemedi", "UYARI", JOptionPane.ERROR_MESSAGE);
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
                Object[] row_user_list =new Object[userArrayList.size()==5?userArrayList.size():5]; // Create a new row array for each user

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
