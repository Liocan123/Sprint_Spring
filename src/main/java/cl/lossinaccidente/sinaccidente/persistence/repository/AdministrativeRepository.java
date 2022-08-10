package cl.lossinaccidente.sinaccidente.persistence.repository;

import cl.lossinaccidente.sinaccidente.domain.dto.Administrative;
import cl.lossinaccidente.sinaccidente.domain.dtoRepository.AdministrativeDTORepository;
import cl.lossinaccidente.sinaccidente.persistence.crud.AdministrativoCrudRepository;
import cl.lossinaccidente.sinaccidente.persistence.entity.Administrativo;
import cl.lossinaccidente.sinaccidente.persistence.mapper.AdministrativeMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdministrativeRepository implements AdministrativeDTORepository {
    private final AdministrativoCrudRepository crudRepository;
    private final AdministrativeMapper mapper;


    public AdministrativeRepository(AdministrativoCrudRepository crudRepository, AdministrativeMapper mapper) {
        this.crudRepository = crudRepository;
        this.mapper = mapper;
    }


    @Override
    public List<Administrative> getAll() {

        return mapper.toAdministratives((List<Administrativo>) crudRepository.findAll());
    }



    @Override
    public Optional<Administrative> getOne(int id) {

        return crudRepository.findById(id).map(mapper::toAdministrative);
    }

    @Override
    public Administrative save(Administrative administrative) {

        return mapper.toAdministrative(crudRepository.save(mapper.toAdministrativo(administrative)));
    }

    @Override
    public void delete(int identificador) {

        crudRepository.deleteById(identificador);
    }

}
