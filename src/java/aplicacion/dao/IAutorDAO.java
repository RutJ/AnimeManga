/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dao;

import aplicacion.modelo.dominio.Autor;
import java.util.List;

/**
 *
 * @author jack
 */
public interface IAutorDAO {
    public void crearAutor (Autor autor);
    public void modificarAutor (Autor autor);
    public void borrarAutor (Autor autor);
    public void consultarAutor (Autor autor);
    public List <Autor> obtenerAutores();
    
}
