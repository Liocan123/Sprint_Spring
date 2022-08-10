package cl.lossinaccidente.sinaccidente.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data //getters y setters
@AllArgsConstructor //constructor lleno
@NoArgsConstructor //constructor vacio
@ToString //to string
public class Client {

    private Integer id;
    //id_usuario
    private Integer idUsuario;
    private Integer rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    //sistema_de_salud
    private String sistemaDeSalud;
    private String direccion;
    private String comuna;
}
