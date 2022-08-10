package cl.lossinaccidente.sinaccidente.persistence.mapper;

import cl.lossinaccidente.sinaccidente.domain.dto.Usser;
import cl.lossinaccidente.sinaccidente.domain.dto.Visit;
import cl.lossinaccidente.sinaccidente.persistence.entity.Usuario;
import cl.lossinaccidente.sinaccidente.persistence.entity.VisitaTerreno;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {Visit.class})
public interface VisitMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "rutCliente", target = "rutCliente"),
            @Mapping(source = "dia", target = "dia"),
            @Mapping(source = "hora", target = "hora"),
            @Mapping(source = "lugar", target = "lugar"),
            @Mapping(source = "comentarios", target = "comentarios"),
    })
    Visit toVisit(VisitaTerreno usuario);
    List<Visit> toVisits(List<VisitaTerreno> toVisitas);

    @InheritInverseConfiguration
    VisitaTerreno toVisitaTerreno(Visit usser);
}
