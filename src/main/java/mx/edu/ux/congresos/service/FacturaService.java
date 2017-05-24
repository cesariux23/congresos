
package mx.edu.ux.congresos.service;

import java.util.List;

import mx.edu.ux.congresos.model.Factura;

public interface FacturaService {
    Factura findById(int id);
    
    void saveFactura(Factura employee);
 
    List findAllFactura(); 
}
