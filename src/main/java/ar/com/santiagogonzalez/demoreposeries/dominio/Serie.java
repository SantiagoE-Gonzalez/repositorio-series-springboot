/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.santiagogonzalez.demoreposeries.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * debo vincular el objeto de dominio con la bd.
 * @author Santiago Gonzalez
 */
@Entity //Indica que la clase estara asociada con una tabla en la bd. Se asume que el nombre de la tabla sera iguale n la clase, sino se usa @table para indicar un nombre diferente
@Table (name = "series")
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Dice que el valor es autogenerado con estrategia automatica.
    private Integer id;
    private String nombre;
    private String descripcion;
    private String imagenUrl;

    public Serie() {
    }

    

    public Serie(String nombre, String descripcion, String url) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.setImagenUrl(url);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String url) {
        if (url == null) {
            this.imagenUrl = "https://image.shutterstock.com/image-vector/default-ui-image-placeholder-wireframes-260nw-1037719192.jpg";
        } else {
            this.imagenUrl = url;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
