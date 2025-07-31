package view;

import javax.swing.*;
import java.awt.*;

public class TelaFuncionario extends JFrame {
    public TelaFuncionario() {
        setTitle("Área do Funcionário");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel("Bem-vindo, Funcionário!", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));

        add(label);
        setVisible(true);
    }
}
