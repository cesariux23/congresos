package mx.edu.ux.congresos.converter;

import mx.edu.ux.congresos.model.Congreso;
import mx.edu.ux.congresos.service.CongresoService;
import org.springframework.core.convert.converter.Converter;

public class IdCongresoToCongresoConverter implements Converter<String,Congreso>{
    
    private final CongresoService congresoService;
    
    public IdCongresoToCongresoConverter(CongresoService congresoService) {
        System.out.println(" ************************************************ Creando converter ******************************************");
        this.congresoService = congresoService;
    }

    public Congreso convert(String congreso) {
        System.out.println(" ************************************************ Dentro del  converter ******************************************");
        return congresoService.findById(new Integer(congreso));
    }
    
}
