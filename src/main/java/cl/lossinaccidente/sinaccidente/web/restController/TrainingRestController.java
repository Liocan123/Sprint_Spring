package cl.lossinaccidente.sinaccidente.web.restController;

import cl.lossinaccidente.sinaccidente.domain.dto.Administrative;
import cl.lossinaccidente.sinaccidente.domain.dto.Training;
import cl.lossinaccidente.sinaccidente.domain.service.AdministrativeService;
import cl.lossinaccidente.sinaccidente.domain.service.TrainingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training")
public class TrainingRestController {
    private final TrainingService service;

    public TrainingRestController(TrainingService service) {
        this.service = service;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Training>> getAll(){

        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{identificador}")
    public ResponseEntity<Training> findById(@PathVariable("identificador") int identificador){
        return service.getOne(identificador)
                .map(training -> new ResponseEntity<>(training, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Training> save(@RequestBody Training training){
        return new ResponseEntity<>(service.save(training), HttpStatus.OK);
    }
    @DeleteMapping("/del/{identificador}")
    public ResponseEntity delete(@PathVariable("identificador") int identificador){
        if (service.delete(identificador)){
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }


}
