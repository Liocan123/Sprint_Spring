package cl.lossinaccidente.sinaccidente.domain.dtoRepository;
import cl.lossinaccidente.sinaccidente.domain.dto.Training;
import java.util.List;
import java.util.Optional;


/*
-TrainingRepository
 */

//Funciones/metodos para el servicio
public interface TrainingDTORepository {

    List<Training> getAll(); //mostrar listado
    Optional<Training> getOne(int identificador); //obtener por identificador
    Training save(Training training); //guardar una cosa
    void delete(int identificador); //borrar cosa
}
