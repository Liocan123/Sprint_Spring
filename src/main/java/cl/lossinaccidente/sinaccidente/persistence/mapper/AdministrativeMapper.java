package cl.lossinaccidente.sinaccidente.persistence.mapper;

import cl.lossinaccidente.sinaccidente.domain.dto.Administrative;
import cl.lossinaccidente.sinaccidente.persistence.entity.Administrativo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {Administrative.class})
public interface AdministrativeMapper {
    /*
        private Integer id;
    //id_usuario
    private Integer idUsuario;
    private String area;
    //experiencia_previa
    private  String experiencia;
     */

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "idUsuario", target = "idUsuario"),
            @Mapping(source = "area", target = "area"),
            @Mapping(source = "experiencia", target = "experiencia"),
    })
    Administrative toAdministrative(Administrativo administrativo);
    List<Administrative> toAdministratives(List<Administrativo> administrativos);

    @InheritInverseConfiguration
    Administrativo toAdministrativo(Administrative administrative);
}
