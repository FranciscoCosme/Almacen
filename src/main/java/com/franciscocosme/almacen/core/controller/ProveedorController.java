package com.franciscocosme.almacen.core.controller;

import com.franciscocosme.almacen.core.sistema.Principal;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class ProveedorController implements Initializable {
    private Principal principal;
    @FXML private TableView tblProveedor;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    public void setPrincipal(Principal principal){
        this.principal = principal;
        
    }
    
    public void regresarVentanaPrincipal() throws IOException{
        this.principal.mostrarVentanaPrincipal();
    }
}
