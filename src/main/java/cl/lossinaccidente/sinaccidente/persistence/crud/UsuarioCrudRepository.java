package cl.lossinaccidente.sinaccidente.persistence.crud;

import cl.lossinaccidente.sinaccidente.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioCrudRepository extends CrudRepository<Usuario, Integer> {
}
