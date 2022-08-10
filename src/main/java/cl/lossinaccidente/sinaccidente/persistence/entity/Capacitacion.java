package cl.lossinaccidente.sinaccidente.persistence.entity;

import javax.persistence.*;
import lombok.*;

/*
Aprovechando la clase de Capacitacion y adjuntos para hacer un mini tutorial
orden de lectura
-Capacitacion
-Training
-TrainingMapper
-CapacitacionCrudRepository
-TrainingDTORepository
-TrainingRepository
 */

@Entity //define que esto como entidad, es decir, que está ligado a una tabla en la base de datos
@Table(name="capacitacion") //nombre de la tabla
public class Capacitacion {
        @Id //define que es la llave primaria
        @GeneratedValue(strategy = GenerationType.IDENTITY) //indica que es auto incremental
        private Integer identificador;
        private Integer rut;
        private String dia;
        private String hora;
        private String lugar;
        private String duracion;
        @Column(name="asistentes") //en caso de que el nombre de la columna en la base de datos y del atributo no coincidan
        private Integer cantidadDeAsistentes;

        public Integer getIdentificador() {
                return identificador;
        }

        public void setIdentificador(int identificador) {
                this.identificador = identificador;
        }

        public Integer getRut() {
                return rut;
        }

        public void setRut(int rut) {
                this.rut = rut;
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

        public String getDuracion() {
                return duracion;
        }

        public void setDuracion(String duracion) {
                this.duracion = duracion;
        }

        public Integer getCantidadDeAsistentes() {
                return cantidadDeAsistentes;
        }

        public void setCantidadDeAsistentes(int cantidadDeAsistentes) {
                this.cantidadDeAsistentes = cantidadDeAsistentes;
        }

        public Capacitacion() {
        }

        public Capacitacion(Integer identificador, Integer rut, String dia, String hora, String lugar, String duracion, Integer cantidadDeAsistentes) {
                this.identificador = identificador;
                this.rut = rut;
                this.dia = dia;
                this.hora = hora;
                this.lugar = lugar;
                this.duracion = duracion;
                this.cantidadDeAsistentes = cantidadDeAsistentes;
        }

        @Override
        public String toString() {
                return "Capacitacion{" +
                        "identificador=" + identificador +
                        ", rut=" + rut +
                        ", dia='" + dia + '\'' +
                        ", hora='" + hora + '\'' +
                        ", lugar='" + lugar + '\'' +
                        ", duracion='" + duracion + '\'' +
                        ", cantidadDeAsistentes=" + cantidadDeAsistentes +
                        '}';
        }
}
