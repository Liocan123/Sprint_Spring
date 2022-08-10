package cl.lossinaccidente.sinaccidente.web.restController;

import cl.lossinaccidente.sinaccidente.domain.dto.Client;
import cl.lossinaccidente.sinaccidente.domain.dto.Training;
import cl.lossinaccidente.sinaccidente.domain.service.ClientService;
import cl.lossinaccidente.sinaccidente.domain.service.TrainingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientRestController {
    private final ClientService service;

    public ClientRestController(ClientService service) {
        this.service = service;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Client>> getAll(){

        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Client> findById(@PathVariable("id") int id){
        return service.getOne(id)
                .map(training -> new ResponseEntity<>(training, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Client> save(@RequestBody Client client){
        return new ResponseEntity<>(service.save(client), HttpStatus.OK);
    }
    @DeleteMapping("/del/{id}")
    public ResponseEntity delete(@PathVariable("id") int id){
        if (service.delete(id)){
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }


}
