package cl.lossinaccidente.sinaccidente.domain.service;


import cl.lossinaccidente.sinaccidente.domain.dto.Professional;
import cl.lossinaccidente.sinaccidente.domain.dto.Training;
import cl.lossinaccidente.sinaccidente.domain.dtoRepository.ProfessionalDTORepository;
import cl.lossinaccidente.sinaccidente.domain.dtoRepository.TrainingDTORepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessionalService {
    private final ProfessionalDTORepository repository;

    public ProfessionalService(ProfessionalDTORepository repository) {
        this.repository = repository;
    }

    public List<Professional> getAll(){
        return repository.getAll();
    }

    public Optional<Professional> getOne(int idUsuario){
        return repository.getOne(idUsuario);
    }

    public Professional save(Professional p){
        return repository.save(p);
    }

    public boolean delete(int idUsuario){
        return getOne(idUsuario)
                .map(professional -> {
                    repository.delete(idUsuario);
                    return true;
                }).orElse(false);
    }


}
