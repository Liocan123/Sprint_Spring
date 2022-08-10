package cl.lossinaccidente.sinaccidente.persistence.repository;

import cl.lossinaccidente.sinaccidente.persistence.crud.CapacitacionCrudRepository;
import cl.lossinaccidente.sinaccidente.persistence.entity.Capacitacion;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CapacitacionRepository {

    private final CapacitacionCrudRepository crudRepository;

    public CapacitacionRepository(CapacitacionCrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    public List<Capacitacion> getAll(){
        return (List<Capacitacion>) crudRepository.findAll();
    }
    public Optional<Capacitacion> getOne(int identificador){
        return crudRepository.findById(identificador);
    }
    public Capacitacion save(Capacitacion c){
        return crudRepository.save(c);
    }
    public void delete(int identificador){
        crudRepository.deleteById(identificador);
    }
}
