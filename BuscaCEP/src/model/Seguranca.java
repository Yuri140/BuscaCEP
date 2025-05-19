package model;

import java.io.File;
import javax.swing.JOptionPane;

public class Seguranca {
    public static boolean Denuvo() {
        boolean exists = (new File("C:\\Program Files\\BuscaCEP\\key.dll")).exists();
        if (exists) {
            JOptionPane.showMessageDialog(null, "Você está autorizado");
        } else {
            JOptionPane.showMessageDialog(null, "Você está usando uma versão ilegal do software em questão.");
            System.exit(0);
        }
        return exists;
    }
}