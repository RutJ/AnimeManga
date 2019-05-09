/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Autor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jack
 */
public class ListaAutores implements Serializable{
    private List<Autor> autores;

    public ListaAutores() {
        autores = new ArrayList<>();
    }
    public void agregarAutor(Autor autor){
        autores.add(autor);
    }
    
    //GETTER AND SETTER
    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
}
