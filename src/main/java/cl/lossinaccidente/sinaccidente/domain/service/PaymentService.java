package cl.lossinaccidente.sinaccidente.domain.service;


import cl.lossinaccidente.sinaccidente.domain.dto.Client;
import cl.lossinaccidente.sinaccidente.domain.dto.Payment;
import cl.lossinaccidente.sinaccidente.domain.dtoRepository.ClientDTORepository;
import cl.lossinaccidente.sinaccidente.domain.dtoRepository.PaymentDTORepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {
    private final PaymentDTORepository repository;

    public PaymentService(PaymentDTORepository repository) {
        this.repository = repository;
    }

    public List<Payment> getAll(){
        return repository.getAll();
    }

    public Optional<Payment> getOne(int identificador){
        return repository.getOne(identificador);
    }

    public Payment save(Payment payment){
        return repository.save(payment);
    }

    public boolean delete(int id){
        return getOne(id)
                .map(cliente -> {
                    repository.delete(id);
                    return true;
                }).orElse(false);
    }


}
