package cl.lossinaccidente.sinaccidente.persistence.crud;

import cl.lossinaccidente.sinaccidente.persistence.entity.Capacitacion;
import org.springframework.data.repository.CrudRepository;

/*
-TrainingDTORepository
-TrainingRepository
 */

/*
Coso que invoca los metodos del Crud
estos son los comunican el codigo javita con la base de datos, para no tener que escribir sql para
las Querrys más comunes
*/
public interface CapacitacionCrudRepository extends CrudRepository<Capacitacion, Integer> {

}
