package view;

import controller.LoginController;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoSenha;
    private JButton botaoLogin;

    public LoginView() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        campoUsuario = new JTextField();
        campoSenha = new JPasswordField();
        botaoLogin = new JButton("Entrar");

        JPanel painel = new JPanel(new GridLayout(4, 2, 5, 5));
        painel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        painel.add(new JLabel("Usuário:"));
        painel.add(campoUsuario);
        painel.add(new JLabel("Senha:"));
        painel.add(campoSenha);
        painel.add(new JLabel(""));
        painel.add(botaoLogin);

        JButton botaoCadastro = new JButton("Cadastrar Novo Usuário");
        botaoCadastro.addActionListener(e -> new CadastroView());
        painel.add(new JLabel(""));
        painel.add(botaoCadastro);

        botaoLogin.addActionListener(e -> {
            String username = campoUsuario.getText();
            String senha = new String(campoSenha.getPassword());

            new LoginController().autenticar(username, senha, this);
        });

        add(painel);
        setVisible(true);
    }
}
