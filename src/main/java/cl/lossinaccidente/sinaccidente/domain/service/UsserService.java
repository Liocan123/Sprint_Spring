package cl.lossinaccidente.sinaccidente.domain.service;


import cl.lossinaccidente.sinaccidente.domain.dto.Training;
import cl.lossinaccidente.sinaccidente.domain.dto.Usser;
import cl.lossinaccidente.sinaccidente.domain.dtoRepository.TrainingDTORepository;
import cl.lossinaccidente.sinaccidente.domain.dtoRepository.UsserDTORepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsserService {
    private final UsserDTORepository repository;

    public UsserService(UsserDTORepository repository) {
        this.repository = repository;
    }

    public List<Usser> getAll(){
        return repository.getAll();
    }

    public Optional<Usser> getOne(int identificador){
        return repository.getOne(identificador);
    }

    public Usser save(Usser u){
        return repository.save(u);
    }

    public boolean delete(int id){
        return getOne(id)
                .map(usuario -> {
                    repository.delete(id);
                    return true;
                }).orElse(false);
    }


}
