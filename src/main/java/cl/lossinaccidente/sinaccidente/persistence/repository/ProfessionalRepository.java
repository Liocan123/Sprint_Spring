package cl.lossinaccidente.sinaccidente.persistence.repository;

import cl.lossinaccidente.sinaccidente.domain.dto.Professional;
import cl.lossinaccidente.sinaccidente.domain.dtoRepository.ProfessionalDTORepository;
import cl.lossinaccidente.sinaccidente.persistence.crud.ProfesionalCrudRepository;
import cl.lossinaccidente.sinaccidente.persistence.entity.Profesional;
import cl.lossinaccidente.sinaccidente.persistence.mapper.ProfessionalMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProfessionalRepository implements ProfessionalDTORepository {
    private final ProfesionalCrudRepository crudRepository;
    private final ProfessionalMapper mapper;

    public ProfessionalRepository(ProfesionalCrudRepository crudRepository, ProfessionalMapper mapper) {
        this.crudRepository = crudRepository;
        this.mapper = mapper;
    }


    @Override
    public List<Professional> getAll() {
        return mapper.toProfessionals((List<Profesional>) crudRepository.findAll());
    }

    @Override
    public Optional<Professional> getOne(int id) {

        return crudRepository.findById(id).map(mapper::toProfessional);
    }

    @Override
    public Professional save(Professional professional) {
        return mapper.toProfessional(crudRepository.save(mapper.toProfesional(professional)));
    }

    @Override
    public void delete(int identificador) {
        crudRepository.deleteById(identificador);
    }
}
