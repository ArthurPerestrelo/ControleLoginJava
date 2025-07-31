package view;

import javax.swing.*;
import java.awt.*;

public class TelaGerente extends JFrame {
    public TelaGerente() {
        setTitle("Área do Gerente");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel("Bem-vindo, Gerente!", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));

        add(label);
        setVisible(true);
    }
}
