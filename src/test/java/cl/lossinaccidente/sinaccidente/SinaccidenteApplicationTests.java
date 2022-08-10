package cl.lossinaccidente.sinaccidente;


import cl.lossinaccidente.sinaccidente.persistence.repository.iAcceso;
import cl.lossinaccidente.sinaccidente.web.model.Acceso;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class SinaccidenteApplicationTests {

	@Autowired
	private iAcceso repo;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Test
	void crearUsuarioTest() {
		Acceso acc = new Acceso();
		acc.setId(3);
		acc.setUser("administrativo");
		acc.setPass(encoder.encode("administrativo"));
		repo.save(acc);
		Acceso retorno = repo.save(acc);

		assertTrue(retorno.getPass().equalsIgnoreCase(acc.getPass()));


	}

}
