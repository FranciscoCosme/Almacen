package com.franciscocosme.almacen.core.service;

import com.franciscocosme.almacen.core.model.Compra;
import java.util.List;

public interface CompraService  {
    
    public List<Compra> findAllCompra();
    public Compra findById(Long numeroDocumento);
    public void saveCompra(Compra elemento);
    public void deleteCompra(Compra elemento);
    public void updateCompra(Compra elemento);
    
}
