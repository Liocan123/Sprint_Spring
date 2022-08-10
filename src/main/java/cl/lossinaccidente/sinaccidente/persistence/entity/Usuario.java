package cl.lossinaccidente.sinaccidente.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int idUsuario;
    private int run;
    private String nombre;
    @Column(name="fecha_nacimiento")
    private String fechaDeNacimiento;
    @Column(name="tipo_de_usuario")
    private String tipoDeUsuario;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public Usuario() {
    }

    public Usuario(int idUsuario, int run, String nombre, String fechaDeNacimiento, String tipoDeUsuario) {
        this.idUsuario = idUsuario;
        this.run = run;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", run=" + run +
                ", nombre='" + nombre + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", tipoDeUsuario='" + tipoDeUsuario + '\'' +
                '}';
    }
}
