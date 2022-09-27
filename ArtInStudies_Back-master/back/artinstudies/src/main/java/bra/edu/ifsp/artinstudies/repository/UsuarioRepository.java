package bra.edu.ifsp.artinstudies.repository;
import org.springframework.data.repository.CrudRepository;
import bra.edu.ifsp.artinstudies.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}