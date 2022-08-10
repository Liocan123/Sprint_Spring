package cl.lossinaccidente.sinaccidente.domain.dtoRepository;

import cl.lossinaccidente.sinaccidente.domain.dto.Administrative;
import cl.lossinaccidente.sinaccidente.domain.dto.Training;

import java.util.List;
import java.util.Optional;


public interface AdministrativeDTORepository {

    List<Administrative> getAll();
    Optional<Administrative> getOne(int id);
    Administrative save(Administrative administrative);
    void delete(int id);

}
