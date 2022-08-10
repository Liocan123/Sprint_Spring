package cl.lossinaccidente.sinaccidente.persistence.repository;

import cl.lossinaccidente.sinaccidente.domain.dto.Client;
import cl.lossinaccidente.sinaccidente.domain.dtoRepository.ClientDTORepository;
import cl.lossinaccidente.sinaccidente.persistence.crud.ClienteCrudRepository;
import cl.lossinaccidente.sinaccidente.persistence.entity.Cliente;
import cl.lossinaccidente.sinaccidente.persistence.mapper.ClientMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository implements ClientDTORepository {
    private final ClienteCrudRepository crudRepository;
    private final ClientMapper mapper;

    public ClientRepository(ClienteCrudRepository crudRepository, ClientMapper mapper) {
        this.crudRepository = crudRepository;
        this.mapper = mapper;
    }


    @Override
    public List<Client> getAll() {
        return mapper.toClients((List<Cliente>) crudRepository.findAll());
    }

    @Override
    public Optional<Client> getOne(int id) {

        return crudRepository.findById(id).map(mapper::toClient);
    }

    @Override
    public Client save(Client client) {
        return mapper.toClient(crudRepository.save(mapper.toCliente(client)));
    }

    @Override
    public void delete(int id) {
        crudRepository.deleteById(id);
    }
}
