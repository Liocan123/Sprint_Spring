package cl.lossinaccidente.sinaccidente.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/checkList")
public class CheckListController {
    Log logger = LogFactory.getLog(CheckListController.class);
    @GetMapping
    public String checkList(Model model){
        logger.warn("Entré al Controller");
        return "checkList";
    }
}