package bra.edu.ifsp.artinstudies.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bra.edu.ifsp.artinstudies.model.Usuario;
import bra.edu.ifsp.artinstudies.repository.UsuarioRepository;

@CrossOrigin
@RestController
public class UsuarioController {

    // método GET
    @GetMapping("/usuario")
    public List<Usuario> listaUsuarios() {
        return UsuarioRepository.all();
    }

    // método GET por ID
    @GetMapping("/usuario/{id}")
    public Usuario RecuperaUsuarioPeloId(@PathVariable("id") int id) {
        return UsuarioRepository.getById(id);
    }

    // método DELETE

    @DeleteMapping("/deletarUsuario/{id}")
    public boolean DeletarUsuarioPeloId(@PathVariable("id") int id) {
        return UsuarioRepository.deletar(id);
    }

    // método POST

    @PostMapping("/usuario")
    public void addUsuario(@RequestBody Usuario usuario) {
        UsuarioRepository.add(usuario);
    }
}
