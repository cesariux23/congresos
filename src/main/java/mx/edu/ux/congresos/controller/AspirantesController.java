package mx.edu.ux.congresos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class AspirantesController {
 
    @RequestMapping("/aspirantes")
    public String index(Model model) {
        model.addAttribute("greeting", "Hello Spring MVC");
        return "helloworld";   
    }
}
