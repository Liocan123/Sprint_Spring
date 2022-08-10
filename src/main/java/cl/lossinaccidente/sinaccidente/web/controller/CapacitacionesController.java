package cl.lossinaccidente.sinaccidente.web.controller;

import cl.lossinaccidente.sinaccidente.domain.service.TrainingService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/capacitaciones")
public class CapacitacionesController {
    Log logger = LogFactory.getLog(ContactoController.class);
   /* private final CapacitacionService service;
    public CapacitacionesController(CapacitacionService service) {
        this.service = service;
    }*/

    private final TrainingService service;

    public CapacitacionesController(TrainingService service) {
        this.service = service;
    }

    @GetMapping
    public String capacitaciones(Model model){
        logger.info("Entré al Controller");
        model.addAttribute("capacitaciones", service.getAll());
        return "capacitaciones";
    }
}

