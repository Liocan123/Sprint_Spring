package cl.lossinaccidente.sinaccidente.persistence.mapper;

import cl.lossinaccidente.sinaccidente.domain.dto.Professional;
import cl.lossinaccidente.sinaccidente.domain.dto.Training;
import cl.lossinaccidente.sinaccidente.persistence.entity.Capacitacion;
import cl.lossinaccidente.sinaccidente.persistence.entity.Profesional;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {Professional.class})
public interface ProfessionalMapper {
    /*
        private Integer id;
    //id_usuario
    private Integer idUsuario;
    private String titulo;
     */

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "idUsuario", target = "idUsuario"),
            @Mapping(source = "titulo", target = "titulo"),
            @Mapping(source = "ingreso", target = "ingreso"),
    })
    Professional toProfessional(Profesional profesional);
    List<Professional> toProfessionals(List<Profesional> profesionales);

    @InheritInverseConfiguration
    Profesional toProfesional(Professional professional);
}
