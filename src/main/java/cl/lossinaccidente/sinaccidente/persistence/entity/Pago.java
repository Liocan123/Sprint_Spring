package cl.lossinaccidente.sinaccidente.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name="rut_cliente")
    Integer rutCliente;
    Integer monto;

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

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public Pago() {
    }

    public Pago(Integer id, Integer rutCliente, Integer monto) {
        this.id = id;
        this.rutCliente = rutCliente;
        this.monto = monto;
    }
}
