package view;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CepView extends JFrame {
    private JTextField cepField;
    private JButton searchButton;
    private JTextArea resultArea;

    public CepView() {
        setTitle("Busca de CEP");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        cepField = new JTextField(20);
        searchButton = new JButton("Buscar");
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);
        
        JPanel panel = new JPanel();
        panel.add(new JLabel("CEP:"));
        panel.add(cepField);
        panel.add(searchButton);
        
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(resultArea), BorderLayout.CENTER);
    }

    public String getCep() {
        return cepField.getText();
    }

    public void setResult(String result) {
        resultArea.setText(result);
    }

    public void addSearchButtonListener(ActionListener listener) {
        searchButton.addActionListener(listener);
    }
}
