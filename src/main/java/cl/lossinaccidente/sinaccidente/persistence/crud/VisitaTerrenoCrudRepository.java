package cl.lossinaccidente.sinaccidente.persistence.crud;

import cl.lossinaccidente.sinaccidente.persistence.entity.Administrativo;
import cl.lossinaccidente.sinaccidente.persistence.entity.VisitaTerreno;
import org.springframework.data.repository.CrudRepository;


public interface VisitaTerrenoCrudRepository extends CrudRepository<VisitaTerreno, Integer> {

}
