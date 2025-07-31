package controller;

import model.Usuario;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class CadastroController {
    private static final String ARQUIVO = "usuarios.dat";

    public static void cadastrarUsuario(Usuario usuario) {
        ArrayList<Usuario> usuarios = recuperarUsuarios();
        usuarios.add(usuario);
        salvarUsuarios(usuarios);
    }

    public static ArrayList<Usuario> recuperarUsuarios() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARQUIVO))) {
            return (ArrayList<Usuario>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    private static void salvarUsuarios(ArrayList<Usuario> usuarios) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARQUIVO))) {
            oos.writeObject(usuarios);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
