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
@RequestMapping("/pagos")
public class PagosController {
    Log logger = LogFactory.getLog(PagosController.class);
    private final PaymentService Service;

    public PagosController(PaymentService service) {
        Service = service;
    }


    @GetMapping("/list")
    public String pagos(Model model){
        logger.info("Entré al Controller");
        model.addAttribute("pagos", Service.getAll());
        return "pagos";
    }

    @GetMapping("/new")
    public String nuevo(Model model){
        logger.info("Entré al Controller");
        model.addAttribute("pago", new Payment());
        return "npago";
    }

    @PostMapping("/new")
    public String savepago(@ModelAttribute Payment pago, Model model){
        logger.info("Entré al Controller");
        Service.save(pago);
        return "redirect:/pagos/list";
    }


}

