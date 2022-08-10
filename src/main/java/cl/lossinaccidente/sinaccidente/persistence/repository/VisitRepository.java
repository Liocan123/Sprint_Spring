package cl.lossinaccidente.sinaccidente.persistence.repository;


import cl.lossinaccidente.sinaccidente.domain.dto.Visit;

import cl.lossinaccidente.sinaccidente.domain.dtoRepository.VisitDTORepository;

import cl.lossinaccidente.sinaccidente.persistence.crud.VisitaTerrenoCrudRepository;

import cl.lossinaccidente.sinaccidente.persistence.entity.VisitaTerreno;

import cl.lossinaccidente.sinaccidente.persistence.mapper.VisitMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VisitRepository implements VisitDTORepository {
    private final VisitaTerrenoCrudRepository crudRepository;
    private final VisitMapper mapper;

    public VisitRepository(VisitaTerrenoCrudRepository crudRepository, VisitMapper mapper) {
        this.crudRepository = crudRepository;
        this.mapper = mapper;
    }


    @Override
    public List<Visit> getAll() {

        return mapper.toVisits((List<VisitaTerreno>) crudRepository.findAll());
    }

    @Override
    public Optional<Visit> getOne(int id) {

        return crudRepository.findById(id).map(mapper::toVisit);
    }

    @Override
    public Visit save(Visit visit) {

        return mapper.toVisit(crudRepository.save(mapper.toVisitaTerreno(visit)));
    }

    @Override
    public void delete(int id) {

        crudRepository.deleteById(id);
    }

}
