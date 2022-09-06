package bra.edu.ifsp.artinstudies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import bra.edu.ifsp.artinstudies.repository.UsuarioRepository;

@CrossOrigin
@SpringBootApplication
@RestController
public class ArtinstudiesApplication {

	public static void main(String[] args) {
		UsuarioRepository.init();
		SpringApplication.run(ArtinstudiesApplication.class, args);
	}

}
