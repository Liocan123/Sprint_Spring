package cl.lossinaccidente.sinaccidente.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
        Log logger = LogFactory.getLog(LoginController.class);
        @GetMapping
        public String inicio(Model model){
            logger.info("Entré al Controller");
            return "login";
        }
}
