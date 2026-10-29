package gt.edu.umg.ApiVentas;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "DetalleFactura")
public class DetalleFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDetalle")
    private Long idDetalle;

    @Column(name = "Producto")
    private String producto;

    @Column(name = "Cantidad")
    private Integer cantidad;

    @Column(name = "Precio")
    private Double precio;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Subtotal")
    private Double subtotal;

    @Column(name = "IdProducto")
    private Integer idProducto;

    @ManyToOne
    @JoinColumn(name = "IdFactura") // Nombre columna foránea
    @JsonIgnore 
    private Factura factura;

    // ... (Getters y Setters igual que antes)
    public Long getIdDetalle() { return idDetalle; }
    public void setIdDetalle(Long idDetalle) { this.idDetalle = idDetalle; }
    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }
    public Integer getCantidad() { return cantidad; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }
    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public Double getSubtotal() { return subtotal; }
    public void setSubtotal(Double subtotal) { this.subtotal = subtotal; }
    public Integer getIdProducto() { return idProducto; }
    public void setIdProducto(Integer idProducto) { this.idProducto = idProducto; }
    public Factura getFactura() { return factura; }
    public void setFactura(Factura factura) { this.factura = factura; }
}