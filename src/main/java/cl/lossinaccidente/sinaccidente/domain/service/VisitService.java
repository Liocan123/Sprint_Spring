package cl.lossinaccidente.sinaccidente.domain.service;


import cl.lossinaccidente.sinaccidente.domain.dto.Client;
import cl.lossinaccidente.sinaccidente.domain.dto.Visit;
import cl.lossinaccidente.sinaccidente.domain.dtoRepository.ClientDTORepository;
import cl.lossinaccidente.sinaccidente.domain.dtoRepository.VisitDTORepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisitService {
    private final VisitDTORepository repository;

    public VisitService(VisitDTORepository repository) {
        this.repository = repository;
    }

    public List<Visit> getAll(){
        return repository.getAll();
    }

    public Optional<Visit> getOne(int id){
        return repository.getOne(id);
    }

    public Visit save(Visit visit){
        return repository.save(visit);
    }

    public boolean delete(int id){
        return getOne(id)
                .map(cliente -> {
                    repository.delete(id);
                    return true;
                }).orElse(false);
    }


}
