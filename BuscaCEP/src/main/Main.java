package main;

import controller.AuthController;
import controller.CepController;
import model.CepModel;
import view.MainView;

public class Main {
    public static void main(String[] args) {
        // Autenticação
        AuthController authController = new AuthController();
        authController.authenticate();

        // Busca de CEP (será chamada após autenticação bem-sucedida)
        CepModel cepModel = new CepModel();
        MainView mainView = new MainView();
        CepController cepController = new CepController(cepModel, mainView);

        mainView.setVisible(true);
    }
}
