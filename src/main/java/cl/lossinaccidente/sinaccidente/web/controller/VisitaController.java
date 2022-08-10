package cl.lossinaccidente.sinaccidente.web.controller;

import cl.lossinaccidente.sinaccidente.domain.dto.*;
import cl.lossinaccidente.sinaccidente.domain.service.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/visitas")
public class VisitaController {
    Log logger = LogFactory.getLog(VisitaController.class);
    private final VisitService Service;

    public VisitaController(VisitService service) {
        Service = service;
    }


    @GetMapping("/list")
    public String visitas(Model model){
        logger.info("Entré al Controller");
        model.addAttribute("visitas", Service.getAll());
        return "visitas";
    }

    @GetMapping("/save")
    public String savev(Model model){
        logger.info("Entré al Controller");
        model.addAttribute("visita", new Visit());
        return "nvisita";
    }


    @PostMapping("/save")
    public String savevi(@ModelAttribute Visit visita, Model model){
        logger.info("Entré al Controller");
        Service.save(visita);
        return "redirect:/visitas/list";
    }


}

