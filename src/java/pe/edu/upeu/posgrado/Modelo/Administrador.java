/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.posgrado.Modelo;

/**
 *
 * @author micha_000
 */
public class Administrador {
    private int id_administrador;
    private String usuario;
    private String clave;
    private String estado;

    public Administrador() {
    }

    public Administrador(int id_administrador, String usuario, String clave, String estado) {
        this.id_administrador = id_administrador;
        this.usuario = usuario;
        this.clave = clave;
        this.estado = estado;
    }

    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
