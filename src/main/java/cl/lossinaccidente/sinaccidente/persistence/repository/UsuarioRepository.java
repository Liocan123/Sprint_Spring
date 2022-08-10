package cl.lossinaccidente.sinaccidente.persistence.repository;

import cl.lossinaccidente.sinaccidente.persistence.crud.UsuarioCrudRepository;
import cl.lossinaccidente.sinaccidente.persistence.entity.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioRepository {
    private final UsuarioCrudRepository crudRepository;

    public UsuarioRepository(UsuarioCrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    public List<Usuario> getAll(){
        return (List<Usuario>) crudRepository.findAll();
    }


    public Optional<Usuario> getOne(int id){
        return crudRepository.findById(id);
    }


    public Usuario save(Usuario u){
        return crudRepository.save(u);
    }

    public void delete(int id){
        crudRepository.deleteById(id);
    }
}
