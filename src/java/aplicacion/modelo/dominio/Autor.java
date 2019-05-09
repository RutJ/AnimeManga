/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Calendar;


/**
 * 
 * @author jack
 */
public class Autor implements Serializable{
    private int id;
    private String nombreA;
    private Calendar fecha;

    public Autor() {
        fecha = Calendar.getInstance();
    }
    
    public Autor(String nombreA, Calendar fecha,int id) {
        this.nombreA = nombreA;
        this.fecha = fecha;
        this.id =id;
    }
    
    //GETTER AND SETTER
    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
