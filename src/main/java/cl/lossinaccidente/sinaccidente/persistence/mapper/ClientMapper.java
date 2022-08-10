package cl.lossinaccidente.sinaccidente.persistence.mapper;

import cl.lossinaccidente.sinaccidente.domain.dto.Client;
import cl.lossinaccidente.sinaccidente.persistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {Client.class})
public interface ClientMapper {


    /*
        private Integer id;
    //id_usuario
    @Column(name="id_usuario")
    private Integer idUsuario;
    private Integer rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    //sistema_de_salud
    @Column(name="sistema_de_salud")
    private String sistemaDeSalud;
    //fecha_nacimiento
    @Column(name="fecha_nacimiento")
    private String fNacimiento;
    private String direccion;
    private String Comuna;
    */
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "idUsuario", target = "idUsuario"),
            @Mapping(source = "rut", target = "rut"),
            @Mapping(source = "nombres", target = "nombres"),
            @Mapping(source = "apellidos", target = "apellidos"),
            @Mapping(source = "telefono", target = "telefono"),
            @Mapping(source = "afp", target = "afp"),
            @Mapping(source = "sistemaDeSalud", target = "sistemaDeSalud"),
            @Mapping(source = "direccion", target = "direccion"),
            @Mapping(source = "comuna", target = "comuna"),
    })
    Client toClient(Cliente cliente);
    List<Client> toClients(List<Cliente> clientes);

    @InheritInverseConfiguration
    Cliente toCliente(Client professional);

}
