package com.franciscocosme.almacen.core.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="factura")
public class Factura implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="numero_factura")
    private Long numeroFactura;
    @Column(name="nit")
    private String nit;
    @Column(name="fecha")
    private Date fecha;
    @Column(name="total")
    private Double total;
    
    public Factura (){
        
    }

    public Factura(Long numeroFactura, String nit, Date fecha, Double total) {
        this.numeroFactura = numeroFactura;
        this.nit = nit;
        this.fecha = fecha;
        this.total = total;
    }

    public Long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(Long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    
    
    
    
}
