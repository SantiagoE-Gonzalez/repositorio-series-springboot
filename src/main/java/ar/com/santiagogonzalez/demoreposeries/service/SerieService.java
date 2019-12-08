/**
 * 
 */
package ar.com.santiagogonzalez.demoreposeries.service;

import ar.com.santiagogonzalez.demoreposeries.dominio.Serie;
import ar.com.santiagogonzalez.demoreposeries.repositories.SerieRepository;
import java.util.List;
import org.springframework.stereotype.Service;


/**
 * Un service es la clase de negocio. Es la que va a ser llamada por el controlador.
 * @author Santiago Gonzalez
 */
@Service
public class SerieService {
    
    //Seteo como private final el repsoitorio y lo agrego en el constructor
    //asi spring se entera que debe inciializarlo y configurarlo.
    private final SerieRepository serieRepository;
    
    public SerieService(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }
    
    public List<Serie> buscarDestacadas(){        
        return serieRepository.findAll();
    }
}
