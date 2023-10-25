package week7.patikaClone.View;

import week7.patikaClone.Helper.Contanst;
import week7.patikaClone.Helper.Helper;
import week7.patikaClone.Model.Operator;
import week7.patikaClone.Model.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        mdl_user_list = new DefaultTableModel();
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

        btn_user_add.addActionListener(e -> {
            if (Helper.isFieldEmpty(field_user_name)|| Helper.isFieldEmpty(field_user_password) || Helper.isFieldEmpty(field_username)) {
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
                } else {
                    System.out.println("User not add");
                    Helper.showMessage("Kullanici eklenemedi", "UYARI", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }

    private void addTableList(Object[] row_user_list) {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_user_list.getModel();
        clearModel.setRowCount(0);
        for (User user : User.getList()) {
            int i=0;
            row_user_list[i++] = user.getId();
            row_user_list[i++] = user.getName();
            row_user_list[i++] = user.getUsername();
            row_user_list[i++] = user.getPassword();
            row_user_list[i++] = user.getType();
            mdl_user_list.addRow(row_user_list);
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
