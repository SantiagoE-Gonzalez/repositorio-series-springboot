
package ar.com.santiagogonzalez.demoreposeries.controller;

import ar.com.santiagogonzalez.demoreposeries.dominio.Serie;
import ar.com.santiagogonzalez.demoreposeries.service.SerieService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Santiago Gonzalez
 */
@Controller //Un controlador es una clase que se encarga de atender peticiones web un mismo controlador puede tener muchos metodos que atiendan distintas url.
public class ListadoController {
    /*
    Spring hace inyeccion de dependencias. 
    Para ello debo especificar acá el service.
    Por ejemplo, si llamo acá al service de SerieService, 
    Spring va a inicializarlo con el constructor y las dependencias necesarias.
    Las mismas deben ser controller o service.
    */
    
    
    private final SerieService serieService;

    public ListadoController(SerieService serieService) {
        this.serieService = serieService;
    }
    
    
    
    @RequestMapping("/") //Le dice al controlador que atiende una URL especifica.
    //Cada requestMapping es una url diferente. El metodo se ejecuta y devuelve un string
    //con el nombre del template que mostrara 
    public String llenarSeries(Model model){
        //Voy a buscar las series.
        /*
        El modelo va a ser el encargado de llevar lo que se deba visualizar.
        */
        
        List<Serie> lista = serieService.buscarDestacadas();
        model.addAttribute("listaDeDestacadas", lista);//Con esta linea agrego la lista
        // vista, y de esa manera puedo desde la plantilla tomarla con el nombre que
        // le indice acá en el set attr
        return "listado"; //pagina a donde voy a ir (template)
    }
    
    
    
}
