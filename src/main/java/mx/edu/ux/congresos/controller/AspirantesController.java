package mx.edu.ux.congresos.controller;

import java.util.ArrayList;
import java.util.List;
import mx.edu.ux.congresos.model.Aspirante;
import mx.edu.ux.congresos.model.Estado;
import mx.edu.ux.congresos.service.EstadoService;
import mx.edu.ux.congresos.service.CongresoService;
import mx.edu.ux.congresos.service.AspiranteService;
import mx.edu.ux.congresos.service.CategoriaInscripcionService;
import mx.edu.ux.congresos.service.CostoService;
import mx.edu.ux.congresos.service.FacturaService;
import mx.edu.ux.congresos.service.MesasService;
import mx.edu.ux.congresos.service.MunicipioService;
import mx.edu.ux.congresos.service.ProfesionService;
import mx.edu.ux.congresos.service.TemaService;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
 
@Transactional
@Controller
@ComponentScan("mx.edu.ux.congresos") 
public class AspirantesController {
    
    @Autowired
    EstadoService serviceEstado;
    @Autowired
    AspiranteService aspiranteService;
    @Autowired
    CongresoService congresoservice;
    @Autowired
    CategoriaInscripcionService categoriaInscripcionservice;
    @Autowired
    CostoService costoservice;
    @Autowired
    FacturaService facturaservice;
    @Autowired
    MesasService mesasservice;
    @Autowired
    MunicipioService municipioservice;
    @Autowired
    ProfesionService profesionservice;
    @Autowired
    TemaService temaservice;
 
    @RequestMapping("/aspirantes")
    public String index(Model model) {
        List aspirantes = aspiranteService.findAllAspirantes();
        model.addAttribute("aspirantes", aspirantes);
        return "aspirantes/index";   
    }
     @RequestMapping("/aspirantes/lista")
    public String ListaAsistentes(Model model) {
        List aspirantes = aspiranteService.findAllAspirantes();
        model.addAttribute("aspirantes", aspirantes);
        return "aspirantes/ListaAsistentes";   
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
        List estados = serviceEstado.findAllEstados();
        List congresos = congresoservice.findAllCongresos();
        List categoriaInscripcion = categoriaInscripcionservice.findAllCategoriaInscripcion();
        List costos = costoservice.findAllCosto();
        List factura = facturaservice.findAllFactura();
        List mesas = mesasservice.findAllMesas();
        Estado edo= serviceEstado.findById(aspirante.getEstado());
        List municipios = new  ArrayList(edo.getMunicipioCollection());
        List profesion = profesionservice.findAllProfesion();
        List temas = temaservice.findAllTema();
        model.addAttribute("congresos", congresos);
        model.addAttribute("estados", estados);
        model.addAttribute("aspirante", aspirante);
        model.addAttribute("categoriaInscripcion", categoriaInscripcion);
        model.addAttribute("costos", costos);
        model.addAttribute("factura", factura);
        model.addAttribute("mesas", mesas);
        model.addAttribute("municipios", municipios);
        model.addAttribute("profesion", profesion);
        model.addAttribute("temas", temas);
        return "aspirantes/form";   
    }
}
