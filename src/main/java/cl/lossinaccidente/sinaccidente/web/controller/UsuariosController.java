package cl.lossinaccidente.sinaccidente.web.controller;

import cl.lossinaccidente.sinaccidente.domain.dto.Administrative;
import cl.lossinaccidente.sinaccidente.domain.dto.Client;
import cl.lossinaccidente.sinaccidente.domain.dto.Professional;
import cl.lossinaccidente.sinaccidente.domain.dto.Usser;
import cl.lossinaccidente.sinaccidente.domain.service.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {
    Log logger = LogFactory.getLog(ContactoController.class);
    private final UsserService uService;
    private final AdministrativeService aService;
    private final ClientService cService;
    private final ProfessionalService pService;

    public UsuariosController(UsserService uService, AdministrativeService aService, ClientService cService, ProfessionalService pService) {
        this.uService = uService;
        this.aService = aService;
        this.cService = cService;
        this.pService = pService;
    }


    @GetMapping("/list")
    public String usuario(Model model){
        logger.info("Entré al Controller");
        model.addAttribute("usuarios", uService.getAll());
        return "usuarios";
    }

    @GetMapping("/listA")
    public String administrativos(Model model){
        logger.info("Entré al Controller");
        model.addAttribute("administrativos", aService.getAll());
        return "administrativos";
    }

    @GetMapping("/listC")
    public String clientes(Model model){
        logger.info("Entré al Controller");
        model.addAttribute("clientes", cService.getAll());
        return "clientes";
    }

    @GetMapping("/listP")
    public String profesionales(Model model){
        logger.info("Entré al Controller");
        model.addAttribute("profesionales", pService.getAll());
        return "profesionales";
    }

    @GetMapping("/new")
    public String nuevo(Model model){
        model.addAttribute("u", new Usser());
        model.addAttribute("a", new Administrative());
        model.addAttribute("c", new Client());
        model.addAttribute("p", new Professional());
        logger.info("Entré al Controller");
        return "usuario2";
    }

    @GetMapping("/administrativo/{id}")
    public String savea(@PathVariable("id") int id, Model model){
        model.addAttribute("a", aService.getOne(id).get());
        logger.info("Entré al Controller");
        return "nadministrativo";
    }

    @GetMapping("/cliente/{id}")
    public String savec(@PathVariable("id") int id, Model model){
        model.addAttribute("c", cService.getOne(id).get());
        logger.info("Entré al Controller");
        return "ncliente";
    }

    @GetMapping("/profesional/{id}")
    public String savep(@PathVariable("id") int id, Model model){
        model.addAttribute("p", pService.getOne(id).get());
        return "nprofesional";
    }

    @PostMapping("/new")
    public String guardar(@ModelAttribute Usser u, Administrative a, Client c, Professional p, Model model){
        logger.error(u.getTipoDeUsuario());

        int id = uService.save(u).getIdUsuario();

        if (u.getTipoDeUsuario().equals("Administrativo")) {
            a.setIdUsuario(id);
            aService.save(a);
            return "redirect:/usuarios/listA";
        } else if (u.getTipoDeUsuario().equals("Cliente")) {
            c.setIdUsuario(id);
            cService.save(c);
            return "redirect:/usuarios/listC";
        } else if (u.getTipoDeUsuario().equals("Profesional")) {
            p.setIdUsuario(id);
            pService.save(p);
            return "redirect:/usuarios/listP";
        }
        return "redirect:/usuarios/list";
    }

    @PostMapping("/administrativo")
    public String savead(@ModelAttribute Administrative a, Model model){
        aService.save(a);
        logger.info("Entré al Controller");
        return "redirect:/usuarios/listA";
    }

    @PostMapping("/cliente")
    public String savecl(@ModelAttribute Client c, Model model){
        cService.save(c);
        logger.info("Entré al Controller");
        return "redirect:/usuarios/listC";
    }

    @PostMapping("/profesional")
    public String savepr(@ModelAttribute Professional p, Model model){
        pService.save(p);
        return "redirect:/usuarios/listP";
    }
}

