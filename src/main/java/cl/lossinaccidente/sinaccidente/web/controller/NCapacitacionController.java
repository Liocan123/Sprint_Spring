package cl.lossinaccidente.sinaccidente.web.controller;

import cl.lossinaccidente.sinaccidente.domain.dto.Training;
import cl.lossinaccidente.sinaccidente.domain.service.TrainingService;
import cl.lossinaccidente.sinaccidente.persistence.entity.Capacitacion;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ncapacitacion")
public class NCapacitacionController {
    Log logger = LogFactory.getLog(InicioController.class);

    //private final CapacitacionService service;

   /* public NCapacitacionController(CapacitacionService service) {
        this.service = service;
    }*/

    private final TrainingService service;

    public NCapacitacionController(TrainingService service) {
        this.service = service;
    }

    @GetMapping
    public String inicio(Model model){


        logger.warn(service.getOne(0).toString());
        //parchecito en service
        model.addAttribute("capacitacion", new Training(0, 0, null, null, null, null, 0));
        model.addAttribute("ncapacitacion", new Training());
        return "ncapacitacion";
    }

    @GetMapping("/{id}")
    public String getCapacitacion(@PathVariable("id") int capacitacionId, Model model){

        logger.warn(service.getOne(capacitacionId).toString());
        model.addAttribute("ncapacitacion", service.getOne(capacitacionId).get());
        return "ncapacitacion";
    }

    @PostMapping
    public String ca(@ModelAttribute Training ncapacitacion, Model model) {
        service.save(ncapacitacion);
        //service.save(ncapacitacion);
        return "redirect:/capacitaciones";
    }
}

