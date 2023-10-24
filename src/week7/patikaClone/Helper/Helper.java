package week7.patikaClone.Helper;

import javax.swing.*;
import java.awt.*;

public class Helper {
    public  static  void setLayout() {
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
    public static  int screenCenter(String axis, int size) {
        int result = 0;
        if (axis.equals("x")) {
            result = (Toolkit.getDefaultToolkit().getScreenSize().width - size) / 2;
        } else if (axis.equals("y")) {
            result = (Toolkit.getDefaultToolkit().getScreenSize().height - size) / 2;
        }
        return result;
    }
}
