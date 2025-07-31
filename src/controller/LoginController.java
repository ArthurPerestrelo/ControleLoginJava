package controller;

import model.Usuario;
import view.TelaFuncionario;
import view.TelaGerente;

import javax.swing.*;
import java.util.ArrayList;

public class LoginController {
    public void autenticar(String username, String senha, JFrame telaAtual) {
        ArrayList<Usuario> usuarios = CadastroController.recuperarUsuarios();
        for (Usuario u : usuarios) {
            if (u.getUsername().equals(username) && u.getSenha().equals(senha)) {
                telaAtual.dispose();
                if (u.getCargo().equalsIgnoreCase("Gerente")) {
                    new TelaGerente();
                } else {
                    new TelaFuncionario();
                }
                return;
            }
        }
        JOptionPane.showMessageDialog(telaAtual, "Usuário ou senha inválidos.");
    }
}
