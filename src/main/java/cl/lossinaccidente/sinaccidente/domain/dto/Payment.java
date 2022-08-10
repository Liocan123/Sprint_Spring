package cl.lossinaccidente.sinaccidente.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data //getters y setters
@AllArgsConstructor //constructor lleno
@NoArgsConstructor //constructor vacio
@ToString //to string
public class Payment {
    Integer id;
    Integer rutCliente;
    Integer monto;
}
