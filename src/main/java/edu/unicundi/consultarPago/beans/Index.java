/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.consultarPago.beans;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Valentina
 */
@ManagedBean(name = "index")
@RequestScoped
public class Index implements Serializable {

    /**
     * la variable nombre almacena el nombre del trabajador
     */
    private String nombre;
    /**
     * la variable apellido almacena el apellido del trabajador
     */
    private String apellido;
    /**
     * la variable cedula almacena el numero de cedula del trabajador
     */
    private int cedula;
    /**
     * la variable fechNacimiento almacena la fecha de nacimiento del trabajador
     */
    private Date fechaNacimiento;
    /**
     * la variable idiomas almacena los idiomas que domina el trabajador
     */
    private ArrayList idiomas;
    /**
     * la variable numeroIdiomas almacena la cantidad de idiomas que domina el
     * trabajador
     */
    private int numeroIdiomas;
    /**
     * la variable nivelEstudios almacena el nivel de estudio que tiene del trabajador
     */
    private String nivelEstudios;
    /**
     * la variable horasTrabajadas almacena las horas trabajadas
     */
    private int horasTrabajadas;

    public Index() {
    }

    /**
     * Metodo para mostrar el valor del nombre del trabajador
     * @return nombre retorna el valor del nombre del trabajador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para modificar el valor del nombre del trabajador
     * @param nombre valor del nombre del trabajador a modificar 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para mostrar el valor del apellido del trabajador
     * @return apellido retorna el valor del nombre del trabajador
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metodo para modificar el valor del apellido del trabajador
     * @param apellido valor del apellido del trabajador a modificar 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Metodo para mostrar el valor de la cedula  del trabajador
     * @return cedula retorna el valor de la cedula  del trabajador
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * Metodo para modificar el valor de la cedula del trabajador
     * @param cedula valor de la cedula del trabajador a modificar 
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * Metodo para mostrar el valor de la fecha de nacimiento  del trabajador
     * @return fechaNacimiento retorna el valor de la fecha de nacimiento  del trabajador
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Metodo para modificar el valor de la fecha de nacimiento del trabajador
     * @param fechaNacimiento valor de la fecha de nacimiento del trabajador a modificar 
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Metodo para mostrar el valor del nivel de estudio del trabajador
     * @return nivelEstudios retorna el valor del nivel de estudio  del trabajador
     */
    public String getNivelEstudios() {
        return nivelEstudios;
    }

    /**
     * Metodo para modificar el valor del nivel de estudio del trabajador
     * @param nivelEstudios valor del nivel de estudio del  trabajador a modificar 
     */
    public void setNivelEstudios(String nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
    }

    /**
     * Metodo para mostrar los idiomas que domina el trabajador
     * @return idiomas retorna el array  de idiomas que domina el trabajador
     */
    public ArrayList getIdiomas() {
        return idiomas;
    }

    /**
     * Metodo para modificar el valor de isiomas que domina el trabajador
     * @param idiomas valor de idiomas que domina el trabajador a modificar 
     */
    public void setIdiomas(ArrayList idiomas) {
        this.idiomas = idiomas;
    }

    /**
     * Metodo para mostrar el numero de idiomas que domina el trabajador
     * @return numeroIdiomas retorna el valor de numero  idiomas que domina el trabajador
     */
    public int getNumeroIdiomas() {
        return numeroIdiomas;
    }

    /**
     * Metodo para modificar el valor del numero de idiomas que domina el trabajador
     * @param numeroIdiomas valor del numero de idiomas que domina el trabajador a modificar 
     */
    public void setNumeroIdiomas(int numeroIdiomas) {
        this.numeroIdiomas = numeroIdiomas;
    }

    /**
     * Metodo para mostrar las horas trabajadas
     * @return horasTrabajadas retorna el valor de las horas trabajadas 
     */
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * Metodo para modificar el valor de horas trabajados
     * @param horasTrabajadas valor de horas trabajadas  a modificar 
     */
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

}
