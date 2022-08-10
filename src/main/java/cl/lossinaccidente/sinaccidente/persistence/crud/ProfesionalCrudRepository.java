package cl.lossinaccidente.sinaccidente.persistence.crud;

import cl.lossinaccidente.sinaccidente.persistence.entity.Administrativo;
import cl.lossinaccidente.sinaccidente.persistence.entity.Profesional;
import org.springframework.data.repository.CrudRepository;


public interface ProfesionalCrudRepository extends CrudRepository<Profesional, Integer> {

}
