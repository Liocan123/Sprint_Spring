package cl.lossinaccidente.sinaccidente.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="administrativo")
public class Administrativo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //id_usuario
    @Column(name="id_usuario")
    private Integer idUsuario;
    private String area;
    //experiencia_previa
    @Column(name="experiencia_previa")
    private  String experiencia;

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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public Administrativo(Integer id, Integer idUsuario, String area, String experiencia) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.area = area;
        this.experiencia = experiencia;
    }

    public Administrativo() {
    }
}
