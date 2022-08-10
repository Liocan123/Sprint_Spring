package cl.lossinaccidente.sinaccidente.domain.service;


import cl.lossinaccidente.sinaccidente.domain.dto.Administrative;
import cl.lossinaccidente.sinaccidente.domain.dto.Training;
import cl.lossinaccidente.sinaccidente.domain.dtoRepository.AdministrativeDTORepository;
import cl.lossinaccidente.sinaccidente.domain.dtoRepository.TrainingDTORepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministrativeService {
    private final AdministrativeDTORepository repository;

    public AdministrativeService(AdministrativeDTORepository repository) {
        this.repository = repository;
    }

    public List<Administrative> getAll(){
        return repository.getAll();
    }

    public Optional<Administrative> getOne(int identificador){
        return repository.getOne(identificador);
    }

    public Administrative save(Administrative a){
        return repository.save(a);
    }

    public boolean delete(int id){
        return getOne(id)
                .map(administrativo -> {
                    repository.delete(id);
                    return true;
                }).orElse(false);
    }


}
