package cl.lossinaccidente.sinaccidente.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data //getters y setters
@AllArgsConstructor //constructor lleno
@NoArgsConstructor //constructor vacio
@ToString //to string
public class Administrative {

    private Integer id;
    //id_usuario
    private Integer idUsuario;
    private String area;
    //experiencia_previa
    private String experiencia;
}
