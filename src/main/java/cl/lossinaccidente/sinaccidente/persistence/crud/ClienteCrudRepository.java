package cl.lossinaccidente.sinaccidente.persistence.crud;

import cl.lossinaccidente.sinaccidente.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteCrudRepository extends CrudRepository<Cliente, Integer> {

}
