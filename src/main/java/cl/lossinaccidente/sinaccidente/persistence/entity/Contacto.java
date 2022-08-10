package cl.lossinaccidente.sinaccidente.persistence.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Contacto {
    private int rut;
    private String nombre;
    private String apellido;
    private String mail;
    private String fono;
    private String mensaje;

}
