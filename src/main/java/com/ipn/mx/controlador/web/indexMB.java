/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.controlador.web;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author leoj_
 */
@ManagedBean(name = "indexMB")
@SessionScoped
public class indexMB extends BaseBean implements Serializable {
    
    private boolean msg = false;
    private String mensaje = "";
    private String alert = "";

    /**
     * Creates a new instance of ProductoMB
     */
    public indexMB() {
    }
    
    @PostConstruct
    public void init(){

    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public boolean isMsg() {
        return msg;
    }

    public void setMsg(boolean msg) {
        this.msg = msg;
    }
    
    
    public String preparedAdd(){
        setAccion(ACC_CREAR);
        return "/producto/productoForm.xhtml?faces-redirect=true";
    }
    
    public String preparedUpdate(){
        setAccion(ACC_ACTUALIZAR);
        return "/producto/productoForm.xhtml?faces-redirect=true";
    }
    
    public String preparedVisualise(){
        setAccion(ACC_VISUALIZAR);
        return "/producto/datosProducto.xhtml?faces-redirect=true";
    }
    
    public String preparedIndex(){
        return "index?faces-redirect=true";
    }
    
    public String preparedListadoProductos(){
        return "/producto/listadoProductos?faces-redirect=true";
    }

    public String preparedListadoCategorias(){
        return "/categoria/listadoCategorias?faces-redirect=true";
    }
    
    public String preparedListadoUsuarios(){
        return "/usuario/listadoUsuarios?faces-redirect=true";
    }
    
    public void resetarMensaje(){
        msg=false;
        mensaje="";
        alert="";
    }
}
