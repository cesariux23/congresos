package mx.edu.ux.congresos.controller;

import mx.edu.ux.congresos.model.Estado;
import mx.edu.ux.congresos.service.EstadoService;
import mx.edu.ux.congresos.service.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Transactional
@Controller
public class HomeController {
    
    @Autowired
    EstadoService estadoService;
    
    @Autowired
    MunicipioService municipioService;
    
    @RequestMapping("/")
    public String hello(Model model) {
        return "home";   
    }
    
    @RequestMapping(value="/getmunicipios" , method=RequestMethod.GET)
    public @ResponseBody Object getmunicipios(@RequestParam("idestado") int idestado) {
        Estado edo= estadoService.findById(idestado);
        if(edo != null){
            return municipioService.findByEstado(edo);
        }
        return new Object();
    }
   
}
