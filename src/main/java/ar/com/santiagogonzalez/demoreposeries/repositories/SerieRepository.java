/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.santiagogonzalez.demoreposeries.repositories;

import ar.com.santiagogonzalez.demoreposeries.dominio.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Un repository de Spring Dat aJPA es una interfaz que extiende de JPARepository.
 * Spring se encargara de implementar nuestra interfaz durante la 
 * ejecucion de la aplicacion.
 * 
 * Al extender, debemos indicar la clase dominio que el JPA gestionara, y 
 * el tipo de dato del id. (en este caso IntegeR).
 * 
 * Al extender ya nos dara metodos utiles como findAll, findById, delete, etc
 * @author Santiago Gonzalez
 */
public interface SerieRepository extends JpaRepository<Serie, Integer>{
    
}
