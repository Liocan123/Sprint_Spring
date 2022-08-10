package cl.lossinaccidente.sinaccidente.domain.dtoRepository;

import cl.lossinaccidente.sinaccidente.domain.dto.Administrative;
import cl.lossinaccidente.sinaccidente.domain.dto.Payment;

import java.util.List;
import java.util.Optional;


public interface PaymentDTORepository {

    List<Payment> getAll();
    Optional<Payment> getOne(int id);
    Payment save(Payment administrative);
    void delete(int id);

}
