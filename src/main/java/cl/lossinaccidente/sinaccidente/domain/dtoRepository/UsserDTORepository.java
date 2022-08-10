package cl.lossinaccidente.sinaccidente.domain.dtoRepository;

import cl.lossinaccidente.sinaccidente.domain.dto.Training;
import cl.lossinaccidente.sinaccidente.domain.dto.Usser;

import java.util.List;
import java.util.Optional;


public interface UsserDTORepository {

    List<Usser> getAll();
    Optional<Usser> getOne(int id);
    Usser save(Usser usser);
    void delete(int id);
}
