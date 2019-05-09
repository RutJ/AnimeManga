/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.Anime;
import java.util.List;

/**
 *
 * @author jack
 */
public interface IAnimeDAO {
    public void agregarAnime (Anime anime);
    public void modificarAnime (Anime anime);
    public void eliminarAnime(Anime anime);
    public void consultarAutor(Anime anime);
    public List <Anime> obtenerListaAnime();
}
