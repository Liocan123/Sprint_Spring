package cl.lossinaccidente.sinaccidente.domain.dtoRepository;

import cl.lossinaccidente.sinaccidente.domain.dto.Administrative;
import cl.lossinaccidente.sinaccidente.domain.dto.Visit;

import java.util.List;
import java.util.Optional;


public interface VisitDTORepository {

    List<Visit> getAll();
    Optional<Visit> getOne(int id);
    Visit save(Visit administrative);
    void delete(int id);

}
