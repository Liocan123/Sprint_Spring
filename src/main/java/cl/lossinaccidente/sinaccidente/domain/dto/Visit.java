package cl.lossinaccidente.sinaccidente.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data //getters y setters
@AllArgsConstructor //constructor lleno
@NoArgsConstructor //constructor vacio
@ToString //to string
public class Visit {
    Integer id;
    Integer rutCliente;
    String dia;
    String hora;
    String lugar;
    String comentarios;

}
