package cl.lossinaccidente.sinaccidente.domain.dtoRepository;

import cl.lossinaccidente.sinaccidente.domain.dto.Administrative;
import cl.lossinaccidente.sinaccidente.domain.dto.Client;
import cl.lossinaccidente.sinaccidente.domain.dto.Training;

import java.util.List;
import java.util.Optional;


public interface ClientDTORepository {

    List<Client> getAll();
    Optional<Client> getOne(int id);
    Client save(Client client);
    void delete(int id);
}
