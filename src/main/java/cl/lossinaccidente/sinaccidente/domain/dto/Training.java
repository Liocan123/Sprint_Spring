package cl.lossinaccidente.sinaccidente.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/*
-TrainingMapper
-CapacitacionCrudRepository
-TrainingDTORepository
-TrainingRepository
 */

//aquí se pueden aplicar cosos de lombok
@Data //getters y setters
@AllArgsConstructor //constructor lleno
@NoArgsConstructor //constructor vacio
@ToString //to string
//viene de capacitacion
public class Training {
    private Integer identificador;
    private Integer rut;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private Integer cantidadDeAsistentes;
}
