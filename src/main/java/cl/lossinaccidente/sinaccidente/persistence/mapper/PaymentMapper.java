package cl.lossinaccidente.sinaccidente.persistence.mapper;

import cl.lossinaccidente.sinaccidente.domain.dto.Payment;
import cl.lossinaccidente.sinaccidente.domain.dto.Usser;
import cl.lossinaccidente.sinaccidente.persistence.entity.Pago;
import cl.lossinaccidente.sinaccidente.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {Payment.class})
public interface PaymentMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "rutCliente", target = "rutCliente"),
            @Mapping(source = "monto", target = "monto"),
    })
    Payment toPayment(Pago pago);
    List<Payment> toPayments(List<Pago> pago);

    @InheritInverseConfiguration
    Pago toPago(Payment payment);
}
