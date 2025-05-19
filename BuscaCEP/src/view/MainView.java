package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainView extends JFrame {
    private JTextField cepField, logradouroField, bairroField, cidadeField, ufField;
    private JButton searchButton;

    public MainView() {
        setTitle("Sistema Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 5, 5));

        add(new JLabel("CEP:"));
        cepField = new JTextField();
        add(cepField);

        add(new JLabel("Logradouro:"));
        logradouroField = new JTextField();
        logradouroField.setEditable(false);
        add(logradouroField);

        add(new JLabel("Bairro:"));
        bairroField = new JTextField();
        bairroField.setEditable(false);
        add(bairroField);

        add(new JLabel("Cidade:"));
        cidadeField = new JTextField();
        cidadeField.setEditable(false);
        add(cidadeField);

        add(new JLabel("UF:"));
        ufField = new JTextField();
        ufField.setEditable(false);
        add(ufField);

        searchButton = new JButton("Buscar");
        add(new JPanel()); // Spacer
        add(searchButton);
    }

    public String getCep() {
        return cepField.getText();
    }

    public void setLogradouro(String logradouro) {
        logradouroField.setText(logradouro);
    }

    public void setBairro(String bairro) {
        bairroField.setText(bairro);
    }

    public void setCidade(String cidade) {
        cidadeField.setText(cidade);
    }

    public void setUf(String uf) {
        ufField.setText(uf);
    }

    public void addSearchButtonListener(ActionListener listener) {
        searchButton.addActionListener(listener);
    }
}
