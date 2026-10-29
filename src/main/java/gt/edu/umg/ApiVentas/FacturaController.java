package gt.edu.umg.ApiVentas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/facturas")
@CrossOrigin(origins = "*")
public class FacturaController {

    @Autowired
    private FacturaRepository facturaRepository; // Necesitas crear este repositorio

    @PostMapping
    public Factura registrarFactura(@RequestBody Factura nuevaFactura) {
        // Asigna la factura a cada detalle antes de guardar
        if (nuevaFactura.getDetalles() != null) {
            for (DetalleFactura detalle : nuevaFactura.getDetalles()) {
                detalle.setFactura(nuevaFactura);
            }
        }
        return facturaRepository.save(nuevaFactura);
    }
}
