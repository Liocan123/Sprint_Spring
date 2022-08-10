package cl.lossinaccidente.sinaccidente.web.restController;

import cl.lossinaccidente.sinaccidente.domain.dto.Administrative;
import cl.lossinaccidente.sinaccidente.domain.service.AdministrativeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/administrative")
public class AdministrativeRestController {
    private final AdministrativeService service;

    public AdministrativeRestController(AdministrativeService service) {
        this.service = service;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Administrative>> getAll(){

        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{studentId}")
    public ResponseEntity<Administrative> findById(@PathVariable("studentId") int studentId){
        return service.getOne(studentId)
                .map(administrative -> new ResponseEntity<>(administrative, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Administrative> save(@RequestBody Administrative administrative){
        return new ResponseEntity<>(service.save(administrative), HttpStatus.OK);
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
