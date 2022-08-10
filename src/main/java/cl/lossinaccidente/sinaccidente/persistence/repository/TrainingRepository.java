package cl.lossinaccidente.sinaccidente.persistence.repository;

import cl.lossinaccidente.sinaccidente.domain.dto.Training;
import cl.lossinaccidente.sinaccidente.domain.dtoRepository.TrainingDTORepository;
import cl.lossinaccidente.sinaccidente.persistence.crud.CapacitacionCrudRepository;
import cl.lossinaccidente.sinaccidente.persistence.entity.Capacitacion;
import cl.lossinaccidente.sinaccidente.persistence.mapper.TrainingMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TrainingRepository implements TrainingDTORepository {
    private final CapacitacionCrudRepository crudRepository; //implementando el crud
    private final TrainingMapper mapper; //llamando al mapper para transformar de Capacitacion a Training segun corresponda.

    //constructor con los dos cosos
    public TrainingRepository(CapacitacionCrudRepository crudRepository, TrainingMapper mapper) {
        this.crudRepository = crudRepository;
        this.mapper = mapper;
    }


    @Override
    public List<Training> getAll() {
        //mapeo para cambiar la lista de capacitaciones que entrega el crud a Trainings.
        return mapper.toTrainings((List<Capacitacion>) crudRepository.findAll());
    }

    @Override
    public Optional<Training> getOne(int identificador) {

        //encuentra un coso por el id               //mapeo
        return crudRepository.findById(identificador).map(mapper::toTraining);
    }

    @Override
    public Training save(Training training) {
        //transforma un Training en capacitacion para aplicar el crud y luego esa capacitacion se vuelve un training para guardarlo.
        return mapper.toTraining(crudRepository.save(mapper.toCapacitacion(training)));
    }

    @Override
    public void delete(int identificador) {
        //borra un coso
        crudRepository.deleteById(identificador);
    }
}
