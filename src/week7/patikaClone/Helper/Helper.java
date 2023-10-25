package week7.patikaClone.Helper;


import javax.swing.*;
import java.awt.*;

public class Helper {
    public static void setLayout() {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (Exception e) {
                    System.out.println("Nimbus LookAndFeel Error");
                }
                break;
            }
        }
    }

    public static int screenCenter(String axis, int size) {
        int result = 0;
        if (axis.equals("x")) {
            result = (Toolkit.getDefaultToolkit().getScreenSize().width - size) / 2;
        } else if (axis.equals("y")) {
            result = (Toolkit.getDefaultToolkit().getScreenSize().height - size) / 2;
        }
        return result;
    }

    public static boolean isFieldEmpty(JTextField textField) {
        return textField.getText().trim().isEmpty();
    }

    public static void showMessage(String message, String title, int type) {
        optionPageTR();
        JOptionPane.showMessageDialog(null, message, title, type);
    }

    public static void optionPageTR() {
        UIManager.put("OptionPane.okButtonText", "Tamam");
        UIManager.put("OptionPane.cancelButtonText", "Iptal");
        UIManager.put("OptionPane.yesButtonText", "Evet");
        UIManager.put("OptionPane.noButtonText", "Hayir");
        UIManager.put("OptionPane.inputDialogTitle", "Giris");


    }

    private static Object buttonEdit(String btnStr) {
        JButton[] buttons = {new JButton()};
        JButton btn = new JButton();
        btn.setText(btnStr);
        btn.setBackground(Color.decode("#FFD966"));
        btn.setForeground(Color.decode("#000000"));
        btn.setFocusable(true);
        return btn;
    }
}
