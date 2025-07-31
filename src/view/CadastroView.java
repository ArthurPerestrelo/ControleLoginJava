package view;

import controller.CadastroController;
import model.Usuario;

import javax.swing.*;
import java.awt.*;

public class CadastroView extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoSenha;
    private JComboBox<String> comboCargo;
    private JButton botaoCadastrar;

    public CadastroView() {
        setTitle("Cadastro de Usuário");
        setSize(300, 220);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        campoUsuario = new JTextField();
        campoSenha = new JPasswordField();
        comboCargo = new JComboBox<>(new String[]{"Gerente", "Funcionário"});
        botaoCadastrar = new JButton("Cadastrar");

        JPanel painel = new JPanel(new GridLayout(4, 2, 5, 5));
        painel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        painel.add(new JLabel("Usuário:"));
        painel.add(campoUsuario);
        painel.add(new JLabel("Senha:"));
        painel.add(campoSenha);
        painel.add(new JLabel("Cargo:"));
        painel.add(comboCargo);
        painel.add(new JLabel(""));
        painel.add(botaoCadastrar);

        botaoCadastrar.addActionListener(e -> {
            String username = campoUsuario.getText();
            String senha = new String(campoSenha.getPassword());
            String cargo = (String) comboCargo.getSelectedItem();

            Usuario usuario = new Usuario(username, senha, cargo);
            CadastroController.cadastrarUsuario(usuario);
            JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");
            dispose();
        });

        add(painel);
        setVisible(true);
    }
}
