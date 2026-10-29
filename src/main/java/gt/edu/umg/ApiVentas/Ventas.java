package gt.edu.umg.ApiVentas;

import jakarta.persistence.*;

@Entity
@Table(name = "Ventas") 
public class Ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String cliente;
    private String producto;
    private Double total;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }

    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }
}