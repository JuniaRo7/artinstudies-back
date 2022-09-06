package bra.edu.ifsp.artinstudies.repository;

import java.util.ArrayList;

import bra.edu.ifsp.artinstudies.model.Usuario;

public class UsuarioRepository {
    private static UsuarioRepository repo;
    private ArrayList<Usuario> usuarios;

    private UsuarioRepository() {
        this.usuarios = new ArrayList<>();
    }

    public static void init() {
        if (UsuarioRepository.repo == null) {
            // Criar repositório
            UsuarioRepository.repo = new UsuarioRepository();

            // Adicionar usuarios
            UsuarioRepository.add(
                    new Usuario("nome", "email", "senha"));
            UsuarioRepository.add(
                    new Usuario("nome2", "email2", "senha2"));
            UsuarioRepository.add(
                    new Usuario("nome3", "email3", "senha3"));
        }

    }

    public static void add(Usuario usuario) {
        UsuarioRepository.repo.usuarios.add(usuario);
    }

    public static ArrayList<Usuario> all() {
        return UsuarioRepository.repo.usuarios;
    }

    // Recupera Usuario pelo Id
    public static Usuario getById(int id) {
        return UsuarioRepository.repo.usuarios.stream().filter((Usuario) -> Usuario.getId() == id).toList().get(0);
    }

    public static boolean deletar(int id) {
        UsuarioRepository.repo.usuarios.remove(id-1);
        return true;
    }
}
