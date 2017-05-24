
package mx.edu.ux.congresos.dao;

import java.util.List;
import mx.edu.ux.congresos.model.Factura;

public interface FacturaDAO {
    Factura findById(int id);
    
    void saveFactura(Factura employee);
 
    List findAllFactura(); 
}
