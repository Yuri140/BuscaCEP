package controller;

import view.MainView;

public class AuthController {
    public void authenticate() {
        if (model.Seguranca.Denuvo()) {
            MainView mainView = new MainView();
            mainView.setVisible(true);
        }
    }
}
