package cl.lossinaccidente.sinaccidente.domain.service;


import cl.lossinaccidente.sinaccidente.domain.dto.Training;
import cl.lossinaccidente.sinaccidente.domain.dtoRepository.TrainingDTORepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainingService {
    private final TrainingDTORepository repository;

    public TrainingService(TrainingDTORepository repository) {
        this.repository = repository;
    }

    public List<Training> getAll(){
        return repository.getAll();
    }

    public Optional<Training> getOne(int identificador){
        return repository.getOne(identificador);
    }

    public Training save(Training t){
        return repository.save(t);
    }

    public boolean delete(int identificador){
        return getOne(identificador)
                .map(capacitacion -> {
                    repository.delete(identificador);
                    return true;
                }).orElse(false);
    }


}
