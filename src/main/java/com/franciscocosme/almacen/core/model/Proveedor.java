package com.franciscocosme.almacen.core.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table (name="proveedor")
@NamedQueries(
        {
            @NamedQuery(name="Proveedor.findAll",query="select p from Proveedor p"),
            @NamedQuery(name="Proveedor.findAllOrderByNit",query="select p from Proveedor p order by p.nit"),
            @NamedQuery(name="Proveedor.findByCodigoProveedor",query="select p from Proveedor where p.codigoProveedor = ?1")
        }
)
public class Proveedor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="codigo_proveedor")
    private Long codigoProveedor;
    @Column(name="nit")
    private String nit;
    @Column(name="razon_social")
    private String razonSocial;
    @Column(name="direccion")
    private String direccion;
    @Column(name="pagina_web")
    private String paginWeb;
    @Column(name="contacto_principal")
    private String contactoPrincipal;
    
     public Proveedor() {
    }

    public Proveedor(Long codigoProveedor, String nit, String razonSocial, String direccion, String paginWeb, String contactoPrincipal) {
        this.codigoProveedor = codigoProveedor;
        this.nit = nit;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.paginWeb = paginWeb;
        this.contactoPrincipal = contactoPrincipal;
    }

    public Long getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(Long codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPaginWeb() {
        return paginWeb;
    }

    public void setPaginWeb(String paginWeb) {
        this.paginWeb = paginWeb;
    }

    public String getContactoPrincipal() {
        return contactoPrincipal;
    }

    public void setContactoPrincipal(String contactoPrincipal) {
        this.contactoPrincipal = contactoPrincipal;
    }
    
    
    
}
