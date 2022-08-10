package cl.lossinaccidente.sinaccidente.web.controller;

import cl.lossinaccidente.sinaccidente.persistence.entity.Contacto;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contacto")
public class ContactoController {
        Log logger = LogFactory.getLog(ContactoController.class);
        @GetMapping
        public String inicio(Model model){
            model.addAttribute("contacto", new Contacto());
            logger.info("Entré al Controller");
            return "contacto";
        }

    @PostMapping
    public String ca(@ModelAttribute Contacto contacto, Model model) {
        model.addAttribute("contacto", contacto);
        Contacto c = (Contacto) model.getAttribute("contacto");
        logger.info(c);
        System.out.println(c);
        return "contacto";
    }
}
