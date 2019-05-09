/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Manga;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jack
 */
public class ListaMangas implements Serializable{
    private List<Manga> mangas;
    
    public ListaMangas() {
        mangas = new ArrayList<>();
    }
    
    
    
    //GETTER AND SETTER

    public List<Manga> getMangas() {
        return mangas;
    }

    public void setMangas(List<Manga> mangas) {
        this.mangas = mangas;
    }
    
}
