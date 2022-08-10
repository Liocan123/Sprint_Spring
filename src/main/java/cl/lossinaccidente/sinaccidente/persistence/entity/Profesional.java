package cl.lossinaccidente.sinaccidente.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="profesional")
public class Profesional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //id_usuario
    @Column(name="id_usuario")
    private Integer idUsuario;
    private String titulo;
    @Column(name="fecha_ingreso")
    private String ingreso;

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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public Profesional() {
    }

    public Profesional(Integer id, Integer idUsuario, String titulo, String ingreso) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.titulo = titulo;
        this.ingreso = ingreso;
    }
}
