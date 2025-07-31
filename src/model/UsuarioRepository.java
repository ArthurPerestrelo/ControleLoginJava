package model;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    private static List<Usuario> usuarios = new ArrayList<>();

    static {
        usuarios.add(new Usuario("admin", "admin123", "gerente"));
        usuarios.add(new Usuario("joao", "senha123", "funcionario"));
    }

    public static Usuario autenticar(String username, String senha) {
        for (Usuario u : usuarios) {
            if (u.getUsername().equals(username) && u.getSenha().equals(senha)) {
                return u;
            }
        }
        return null;
    }

    public static boolean cadastrar(Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u.getUsername().equals(usuario.getUsername())) {
                return false; // já existe
            }
        }
        usuarios.add(usuario);
        return true;
    }
}
