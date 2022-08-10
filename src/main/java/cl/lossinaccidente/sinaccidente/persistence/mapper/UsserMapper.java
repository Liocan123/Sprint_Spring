package cl.lossinaccidente.sinaccidente.persistence.mapper;

import cl.lossinaccidente.sinaccidente.domain.dto.Usser;
import cl.lossinaccidente.sinaccidente.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

//Usser->Usuario
@Mapper(componentModel = "spring", uses = {Usser.class})
public interface UsserMapper {

    /*    private int idUsuario;
    private int run;
    private String nombre;
    @Column(name="fecha_nacimiento")
    private String fechaDeNacimiento;
    @Column(name="tipo_de_usuario")
    private String fechaDeNacimiento;
    */
    @Mappings({
            @Mapping(source = "idUsuario", target = "idUsuario"),
            @Mapping(source = "run", target = "run"),
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "fechaDeNacimiento", target = "fechaDeNacimiento"),
            @Mapping(source = "tipoDeUsuario", target = "tipoDeUsuario"),
    })
    Usser toUsser(Usuario usuario);
    List<Usser> toUssers(List<Usuario> toUsuarios);

    @InheritInverseConfiguration
    Usuario toUsuario(Usser usser);

}
