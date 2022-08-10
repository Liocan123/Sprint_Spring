package cl.lossinaccidente.sinaccidente.persistence.repository;

import cl.lossinaccidente.sinaccidente.domain.dto.Administrative;
import cl.lossinaccidente.sinaccidente.domain.dto.Payment;
import cl.lossinaccidente.sinaccidente.domain.dtoRepository.PaymentDTORepository;
import cl.lossinaccidente.sinaccidente.persistence.crud.PagoCrudRepository;
import cl.lossinaccidente.sinaccidente.persistence.entity.Administrativo;
import cl.lossinaccidente.sinaccidente.persistence.entity.Pago;
import cl.lossinaccidente.sinaccidente.persistence.mapper.PaymentMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PaymentRepository implements PaymentDTORepository {
    private final PagoCrudRepository crudRepository;
    private final PaymentMapper mapper;

    public PaymentRepository(PagoCrudRepository crudRepository, PaymentMapper mapper) {
        this.crudRepository = crudRepository;
        this.mapper = mapper;
    }


    @Override
    public List<Payment> getAll() {

        return mapper.toPayments((List<Pago>) crudRepository.findAll());
    }

    @Override
    public Optional<Payment> getOne(int id) {

        return crudRepository.findById(id).map(mapper::toPayment);
    }

    @Override
    public Payment save(Payment payment) {

        return mapper.toPayment(crudRepository.save(mapper.toPago(payment)));
    }

    @Override
    public void delete(int id) {

        crudRepository.deleteById(id);
    }

}
