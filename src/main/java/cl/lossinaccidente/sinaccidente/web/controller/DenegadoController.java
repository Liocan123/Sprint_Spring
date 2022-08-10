package cl.lossinaccidente.sinaccidente.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/denegado")
public class DenegadoController {
        Log logger = LogFactory.getLog(DenegadoController.class);
        @GetMapping
        public String error403(Model model){
            logger.info("Entré al Controller");
            return "denegado";
        }
}
