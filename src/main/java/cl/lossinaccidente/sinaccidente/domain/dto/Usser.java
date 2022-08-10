package cl.lossinaccidente.sinaccidente.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data //getters y setters
@AllArgsConstructor //constructor lleno
@NoArgsConstructor //constructor vacio
@ToString //to string
public class Usser {
    private int idUsuario;
    private int run;
    private String nombre;
    private String fechaDeNacimiento;
    private String tipoDeUsuario;
}
