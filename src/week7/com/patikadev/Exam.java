package week7.com.patikadev;

import javax.swing.*;
import java.awt.*;

public class Exam extends JFrame {
    private JPanel wrapper;
    private JPanel JPanelTop;
    private JPanel JPanelBottom;
    private JTextField pasword;
    private JButton girisButton;
    private JTextField user;
    private JTextField password;


    public Exam() {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if (true) {
                try {
                    System.out.println(info.getName() + "=>" + info.getClassName());
                   UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            }
        }
        add(wrapper);
        setSize(500, 500);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width) / 2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2;
        setLocation(x, y);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Sınav");
        setVisible(true);
        setResizable(false);
        girisButton.addActionListener(e -> {
            String username = user.getText();
            String password = Exam.this.password.getText();
            if (username.equals("") || password.equals("")) {
                JOptionPane.showMessageDialog(Exam.this, "Kullanıcı adı veya şifre boş olamaz");
                return;
            }
            if (username.equals("admin") && password.equals("12345")) {
                JOptionPane.showMessageDialog(Exam.this, "Giriş Başarılı");
            } else {
                JOptionPane.showMessageDialog(Exam.this, "Giriş Başarısız");
            }
        });
    }
}
