package cl.lossinaccidente.sinaccidente.persistence.repository;

import cl.lossinaccidente.sinaccidente.domain.dto.Usser;
import cl.lossinaccidente.sinaccidente.domain.dtoRepository.UsserDTORepository;
import cl.lossinaccidente.sinaccidente.persistence.crud.UsuarioCrudRepository;
import cl.lossinaccidente.sinaccidente.persistence.entity.Usuario;
import cl.lossinaccidente.sinaccidente.persistence.mapper.UsserMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsserRepository implements UsserDTORepository {
    private final UsuarioCrudRepository crudRepository;
    private final UsserMapper mapper;

    public UsserRepository(UsuarioCrudRepository crudRepository, UsserMapper mapper) {
        this.crudRepository = crudRepository;
        this.mapper = mapper;
    }


    @Override
    public List<Usser> getAll() {
        return mapper.toUssers((List<Usuario>) crudRepository.findAll());
    }

    @Override
    public Optional<Usser> getOne(int id) {

        return crudRepository.findById(id).map(mapper::toUsser);
    }

    @Override
    public Usser save(Usser usser) {
        return mapper.toUsser(crudRepository.save(mapper.toUsuario(usser)));
    }

    @Override
    public void delete(int id) {

        crudRepository.deleteById(id);
    }
}
