package cl.lossinaccidente.sinaccidente.persistence.crud;

import cl.lossinaccidente.sinaccidente.persistence.entity.Administrativo;
import cl.lossinaccidente.sinaccidente.persistence.entity.Pago;
import org.springframework.data.repository.CrudRepository;


public interface PagoCrudRepository extends CrudRepository<Pago, Integer> {

}
