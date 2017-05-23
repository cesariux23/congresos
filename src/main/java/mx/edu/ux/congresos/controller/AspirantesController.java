package mx.edu.ux.congresos.controller;

import java.util.List;
import mx.edu.ux.congresos.model.Aspirante;
import mx.edu.ux.congresos.service.EstadoService;
import mx.edu.ux.congresos.service.AspiranteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
 
@Controller
@ComponentScan("mx.edu.ux.congresos") 
public class AspirantesController {
    
    @Autowired
    EstadoService service;
    @Autowired
    AspiranteService aspiranteService;
 
    @RequestMapping("/aspirantes")
    public String index(Model model) {
        List estados = service.findAllEstados();
        List aspirantes = aspiranteService.findAllAspirantes();
	model.addAttribute("estados", estados);
        model.addAttribute("aspirantes", aspirantes);
        return "aspirantes/index";   
    }
    
    @RequestMapping("/aspirantes/{clave}")
    public String view(Model model, @PathVariable String clave) {
        Aspirante aspirante = aspiranteService.findAspiranteByClaveAspirante(clave);
        System.out.println("Aspirante : "+aspirante.getClaveAspirante());
        model.addAttribute("aspirante", aspirante);
        return "aspirantes/view";   
    }
    
    @RequestMapping("/aspirantes/registro")
    public String register(Model model) {
        Aspirante aspirante = new Aspirante();
        model.addAttribute("aspirante", aspirante);
        return "aspirantes/form";   
    }
}
