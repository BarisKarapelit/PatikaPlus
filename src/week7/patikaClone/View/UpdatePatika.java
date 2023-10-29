package week7.patikaClone.View;

import week7.patikaClone.Helper.Contanst;
import week7.patikaClone.Helper.Helper;
import week7.patikaClone.Model.Patika;

import javax.swing.*;

public class UpdatePatika extends JFrame {
    private JPanel wrapper;
    private JTextField fld_patika_name;
    private JButton btn_update;
    private JLabel fld_app_version;
    private Patika patika;

    public UpdatePatika(Patika patika) {
        this.patika = patika;
        add(wrapper);
        setSize(300, 175);
        setLocation(Helper.screenCenter("x", getSize().width), Helper.screenCenter("y", getSize().height));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Contanst.TITLE_PATIKA_UPDATE);
        setVisible(true);
        fld_patika_name.setText(patika.getName());
        //updatePatika();

        btn_update.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_patika_name)) {
                Helper.showMessage("Değerler boş bırakılamaz", "UYARI", JOptionPane.WARNING_MESSAGE);
            } else {
                String name = fld_patika_name.getText();
                if (Patika.updatePatika(patika.getId(), name)) {
                    Helper.showMessage("Patika başarıyla güncellendi", "BAŞARILI", JOptionPane.INFORMATION_MESSAGE);
                }
                dispose();
            }
        });
        fld_app_version.setText(Contanst.APP_VERSION);
    }

}
