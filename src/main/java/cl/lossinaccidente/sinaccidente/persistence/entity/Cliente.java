package cl.lossinaccidente.sinaccidente.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    private String direccion;
    private String comuna;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getSistemaDeSalud() {
        return sistemaDeSalud;
    }

    public void setSistemaDeSalud(String sistemaDeSalud) {
        this.sistemaDeSalud = sistemaDeSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public Cliente() {
    }

    public Cliente(Integer id, Integer idUsuario, Integer rut, String nombres, String apellidos, String telefono, String afp, String sistemaDeSalud, String direccion, String comuna) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaDeSalud = sistemaDeSalud;
        this.direccion = direccion;
        this.comuna = comuna;
    }
}
