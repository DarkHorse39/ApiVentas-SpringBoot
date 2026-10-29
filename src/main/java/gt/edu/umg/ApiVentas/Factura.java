package gt.edu.umg.ApiVentas;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Factura") 
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdFactura") 
    private int idFactura;

    @Column(name = "NumeroFactura")
    private String numeroFactura; // <-- Cambiado a String

    @Column(name = "Fecha")
    private String fecha; // <-- Cambiado a String

    @Column(name = "Cliente")
    private String cliente;

    @Column(name = "Nit")
    private String nit; // <-- Cambiado a String

    @Column(name = "Total")
    private double total;
    
    @Column(name = "Origen")
    private String origen;


    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL)
    private List<DetalleFactura> detalles;

    // Getters y Setters
    public int getIdFactura() { return idFactura; }
    public void setIdFactura(int idFactura) { this.idFactura = idFactura; }
    public String getNumeroFactura() { return numeroFactura; }
    public void setNumeroFactura(String numeroFactura) { this.numeroFactura = numeroFactura; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }
    public String getNit() { return nit; }
    public void setNit(String nit) { this.nit = nit; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
    public String getOrigen() { return origen; }
    public void setOrigen(String origen) {this.origen = origen;}
    public List<DetalleFactura> getDetalles() { return detalles; }
    public void setDetalles(List<DetalleFactura> detalles) { this.detalles = detalles; }
}
