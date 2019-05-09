/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Anime;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jack
 */
public class ListaAnimes implements Serializable {
    private List<Anime> animes;

    public ListaAnimes() {
        animes = new ArrayList<>();
    }
    
    //GETTER AND SETTER

    public List<Anime> getAnimes() {
        return animes;
    }

    public void setAnimes(List<Anime> animes) {
        this.animes = animes;
    }
    
}
