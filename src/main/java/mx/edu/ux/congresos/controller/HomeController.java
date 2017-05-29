package mx.edu.ux.congresos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Transactional
@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String hello(Model model) {
        return "home";   
    }
    
    @RequestMapping("/getminucipios")
    public String getmunicipios(Model model) {
        return "home";   
    }
}
