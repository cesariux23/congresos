package mx.edu.ux.congresos.controller;

import java.util.List;
import mx.edu.ux.congresos.model.Congreso;
import mx.edu.ux.congresos.service.CongresoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
 
/*
 *
 *Clase para el manejo de Congresos
 *
*/

//Se habilita las transsacciones de hibernate
@Transactional
//se devine como un controlador
@Controller
//se indica el paquete que contiene los componentes
@ComponentScan("mx.edu.ux.congresos") 
public class CongresoController {
    
    //se agrega el servicio
    @Autowired
    CongresoService congresoservice;
    
    //indice de congresos
    
    //ruta para el listado de congresos
    @RequestMapping("/congresos")
    //funcion encargada (metodo GET)
    public String index(Model model) {
        //se recupera la lista de congresos mediante el metodo find all del service
        List congresos = congresoservice.findAllCongresos();
        //se agrega como atributo de la vista
        model.addAttribute("congresos", congresos);
        //se regresa la vista
        return "congresos/index";   
    }
    @RequestMapping("/congresos/lista")
    //funcion encargada (metodo GET)
    public String ListaCongresos(Model model) {
        //se recupera la lista de congresos mediante el metodo find all del service
        List congresos = congresoservice.findAllCongresos();
        //se agrega como atributo de la vista
        model.addAttribute("congresos", congresos);
        //se regresa la vista
        return "congresos/ListaCongresos";   
    }
    
    
    //ruta para el detalle
    //se envia el ID del congreso como parte de la ruta
    @RequestMapping("/congresos/{id}")
    public String view(Model model, @PathVariable int id) {
        //se busca por ID
        Congreso congreso = congresoservice.findById(id);
        // se envia el objeto recuperado a la vista
        model.addAttribute("congreso", congreso);
        // se regresa la vista
        return "congresos/view";   
    }
    
    //ruta para el registro de congresos
    @RequestMapping("/congresos/registro")
    public String register(Model model) {
        //se crea un congreso nuevo
        Congreso congreso = new Congreso();
        //se agrega a la vista el congreso nuevo
        model.addAttribute("congreso", congreso);
        //Se regresa la vista
        return "congresos/form";   
    }
    
    @RequestMapping("/congresos/{id}/bajas")
    public String bajas(Model model, @PathVariable int id) {
        //se busca por ID
        Congreso congreso = congresoservice.findById(id);
        // se envia el objeto recuperado a la vista
        model.addAttribute("congreso", congreso);
        // se regresa la vista
        return "congresos/bajas";   
    }
}