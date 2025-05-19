package view;

import javax.swing.JOptionPane;

public class LoginView {
    public void showUnauthorizedMessage() {
        JOptionPane.showMessageDialog(null, "Versão do sistema não autorizada");
        System.exit(0);
    }
}
