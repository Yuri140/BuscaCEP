package controller;

import model.CepModel;
import view.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.json.JSONObject;

public class CepController {
    private CepModel cepModel;
    private MainView mainView;

    public CepController(CepModel cepModel, MainView mainView) {
        this.cepModel = cepModel;
        this.mainView = mainView;

        this.mainView.addSearchButtonListener((ActionEvent e) -> {
            try {
                String cep = mainView.getCep();
                String result = cepModel.buscaCep(cep);
                JSONObject json = new JSONObject(result);
                
                mainView.setLogradouro(json.getString("logradouro"));
                mainView.setBairro(json.getString("bairro"));
                mainView.setCidade(json.getString("localidade"));
                mainView.setUf(json.getString("uf"));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao buscar CEP");
            }
        });
    }
}
