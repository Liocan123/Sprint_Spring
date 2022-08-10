package cl.lossinaccidente.sinaccidente.domain.service;


import cl.lossinaccidente.sinaccidente.domain.dto.Client;
import cl.lossinaccidente.sinaccidente.domain.dto.Training;
import cl.lossinaccidente.sinaccidente.domain.dtoRepository.ClientDTORepository;
import cl.lossinaccidente.sinaccidente.domain.dtoRepository.TrainingDTORepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private final ClientDTORepository repository;

    public ClientService(ClientDTORepository repository) {
        this.repository = repository;
    }

    public List<Client> getAll(){
        return repository.getAll();
    }

    public Optional<Client> getOne(int identificador){
        return repository.getOne(identificador);
    }

    public Client save(Client client){
        return repository.save(client);
    }

    public boolean delete(int id){
        return getOne(id)
                .map(cliente -> {
                    repository.delete(id);
                    return true;
                }).orElse(false);
    }


}
