package mx.edu.ux.congresos.controller;

import java.util.List;
import mx.edu.ux.congresos.service.EstadoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
 
@Controller
@ComponentScan("mx.edu.ux.congresos") 
public class AspirantesController {
    
    @Autowired
    EstadoService service;
 
    @RequestMapping("/aspirantes")
    public String index(Model model) {
        List estados = service.findAllEstados();
	model.addAttribute("estados", estados);
        return "aspirantes/index";   
    }
}
