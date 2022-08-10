package cl.lossinaccidente.sinaccidente.domain.dtoRepository;

import cl.lossinaccidente.sinaccidente.domain.dto.Administrative;
import cl.lossinaccidente.sinaccidente.domain.dto.Professional;
import cl.lossinaccidente.sinaccidente.domain.dto.Training;

import java.util.List;
import java.util.Optional;


public interface ProfessionalDTORepository {

    List<Professional> getAll();
    Optional<Professional> getOne(int id);
    Professional save(Professional professional);
    void delete(int id);
}
