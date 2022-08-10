package cl.lossinaccidente.sinaccidente.web.restController;

import cl.lossinaccidente.sinaccidente.domain.dto.Client;
import cl.lossinaccidente.sinaccidente.domain.dto.Professional;
import cl.lossinaccidente.sinaccidente.domain.service.ClientService;
import cl.lossinaccidente.sinaccidente.domain.service.ProfessionalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/professional")
public class ProfessionalRestController {
    private final ProfessionalService service;

    public ProfessionalRestController(ProfessionalService service) {
        this.service = service;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Professional>> getAll(){

        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Professional> findById(@PathVariable("id") int id){
        return service.getOne(id)
                .map(training -> new ResponseEntity<>(training, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Professional> save(@RequestBody Professional professional){
        return new ResponseEntity<>(service.save(professional), HttpStatus.OK);
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
