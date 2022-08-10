package cl.lossinaccidente.sinaccidente.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="visita_terreno")
public class VisitaTerreno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name="rut_cliente")
    Integer rutCliente;
    String dia;
    String hora;
    String lugar;
    String comentarios;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(Integer rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public VisitaTerreno() {
    }

    public VisitaTerreno(Integer id, Integer rutCliente, String dia, String hora, String lugar, String comentarios) {
        this.id = id;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "VisitaTerreno{" +
                "id=" + id +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
