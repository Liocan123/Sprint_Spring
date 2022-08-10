package cl.lossinaccidente.sinaccidente.domain.service;

import cl.lossinaccidente.sinaccidente.persistence.entity.Capacitacion;
import cl.lossinaccidente.sinaccidente.persistence.repository.CapacitacionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CapacitacionService {

    private final CapacitacionRepository repository;

    public CapacitacionService(CapacitacionRepository repository) {
        this.repository = repository;
    }

    public List<Capacitacion> getAll(){
        return repository.getAll();
    }

    public Optional<Capacitacion> getOne(int identificador){
        return repository.getOne(identificador);
    }

    public Capacitacion save(Capacitacion c){
        return repository.save(c);
    }



    public boolean delete(int identificador){
        return getOne(identificador)
                .map(usuario -> {
                    repository.delete(identificador);
                    return true;
                }).orElse(false);
    }

    //parche
    public Capacitacion nulo() {
        Capacitacion c = new Capacitacion(0, 0, null, null, null, null, 0);
        return c;
    }
}
