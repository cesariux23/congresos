
package mx.edu.ux.congresos.controller;

//se devine como un controlador

import java.util.List;
import mx.edu.ux.congresos.model.TipoAdministrador;
import mx.edu.ux.congresos.model.Administrador;
import mx.edu.ux.congresos.service.AdministradorService;
import mx.edu.ux.congresos.service.TipoAdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//se indica el paquete que contiene los componentes
@ComponentScan("mx.edu.ux.congresos") 
public class LoginController {
    
    //se agrega el servicio
    @Autowired
    
    AdministradorService administradorservice;
    
    @Autowired
    TipoAdministradorService tipoadministradorservice;
    //indice de Administrador
     //ruta para el listado Administrador
     @RequestMapping("/administradores")
     //funcion encargada (metodo GET)
    
    public String index(Model model) {
        //se recupera la lista de congresos mediante el metodo find all del service
        List administrador = administradorservice.findAllAdministrador();
        //se agrega como atributo de la vista
        model.addAttribute("administrador", administrador);
         //se regresa la vista
        return "administradores/index";
    }
    //ruta para el detalle
    //se envia el ID del Administrador como parte de la ruta
    
    @RequestMapping("/administradores/{id}")
    
    public String view(Model model, @PathVariable int id) {
        //se busca por ID
        Administrador administrador = administradorservice.findById(id);
        // se envia el objeto recuperado a la vista
        model.addAttribute("administrador", administrador);
        // se regresa la vista
        return "administradores/view";   
    }
    
    //ruta para el registro Administrador
    @RequestMapping("/administradores/registro")
    public String register(Model model) {
        //se crea un congreso nuevo
        Administrador administrador = new Administrador();
        //se agrega a la vista el congreso nuevo
        model.addAttribute("administrador", administrador);
        //Se regresa la vista
        return "administradores/form";   
    }
}
