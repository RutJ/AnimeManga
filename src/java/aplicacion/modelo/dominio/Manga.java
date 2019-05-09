/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author jack
 */
public class Manga implements Serializable{
    private String nombre;
    private int capitulos;
    private Autor autor;
    private int temporadas;
    private String genero;
    private String servidor;
    private boolean finalizado;
    
    public Manga(){
        autor = new Autor();
    }

    public Manga(String nombre, int capitulos, Autor autor, int temporadas, String genero, String servidor, boolean finalizado) {
        this.nombre = nombre;
        this.capitulos = capitulos;
        this.autor = autor;
        this.temporadas = temporadas;
        this.genero = genero;
        this.servidor = servidor;
        this.finalizado = finalizado;
    }
    
    

    //GETTER AND SETTER
    
    public boolean isFinalizado() {
        return finalizado;
    }
    
    public void setFinalizado(boolean finalizado) {    
        this.finalizado = finalizado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }
    
    
    
}
