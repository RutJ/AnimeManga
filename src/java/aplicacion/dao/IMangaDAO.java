/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.Manga;
import java.util.List;

/**
 *
 * @author jack
 */
public interface IMangaDAO {
    public void agregarManga (Manga manga);
    public void modificarManga (Manga manga);
    public void eliminarManga (Manga manga);
    public List<Manga> obtenerMangas(); 
    
}
