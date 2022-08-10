package cl.lossinaccidente.sinaccidente.persistence.repository;


import cl.lossinaccidente.sinaccidente.web.model.Acceso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iAcceso extends JpaRepository<Acceso, Integer> {

    Acceso findByUser(String user);
}
