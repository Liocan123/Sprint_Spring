package cl.lossinaccidente.sinaccidente.persistence.mapper;


import cl.lossinaccidente.sinaccidente.domain.dto.Training;
import cl.lossinaccidente.sinaccidente.persistence.entity.Capacitacion;
import org.mapstruct.*;

import java.util.List;

/*
-CapacitacionCrudRepository
-TrainingDTORepository
-TrainingRepository
 */


// training->capacitacion
@Mapper(componentModel = "spring", uses = {Training.class}) //enlazando las clases
        // indica que usamos spring //indica la clase a mapear (se pone la del DTO)
public interface TrainingMapper {

    //Mappings: para indicar que aquí están las relaciones
    //Mapping:
        //source y target para indicar que el valor de una 'variable' viaja a la otra enlazandolas
    @Mappings({
            @Mapping(source = "identificador", target = "identificador"),
            @Mapping(source = "rut", target = "rut"),
            @Mapping(source = "dia", target = "dia"),
            @Mapping(source = "hora", target = "hora"),
            @Mapping(source = "lugar", target = "lugar"),
            @Mapping(source = "duracion", target = "duracion"),
            @Mapping(source = "cantidadDeAsistentes", target = "cantidadDeAsistentes"),
    })
    Training toTraining(Capacitacion capacitacion); //por unidad
    List<Training> toTrainings(List<Capacitacion> capacitaciones); //por lista

    @InheritInverseConfiguration
    Capacitacion toCapacitacion(Training training);
}
