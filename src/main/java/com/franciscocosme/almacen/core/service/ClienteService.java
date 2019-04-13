package com.franciscocosme.almacen.core.service;

import com.franciscocosme.almacen.core.model.Cliente;
import java.util.List;

public interface ClienteService {
    public List<Cliente> findAllCliente();
    public Cliente findById(String nit);
    public void saveCliente(Cliente elemento);
    public void deleteCliente(Cliente elemento);
    public void updateCliente(Cliente elemento);
    
}
