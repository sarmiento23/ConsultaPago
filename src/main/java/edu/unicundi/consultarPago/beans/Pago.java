/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.consultarPago.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.text.SimpleDateFormat;

/**
 *
 * @author Luz
 */
@ManagedBean(name = "pago")
@RequestScoped
public class Pago implements Serializable {

    @ManagedProperty("#{index}")
    /**
     * la variable informacion trae todos los datos del formulario 
     */
    private Index informacion;
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
     * la variable nivelEstudios almacena el nivel de estudio que tiene del
     * trabajador
     */
    private String nivelEstudios;
    /**
     * la variable idiomas almacena los idiomas que domina el trabajador
     */
    private ArrayList idiomas;
    /**
     * la variable pagoTotal almacena el valor del pago total del trabajador
     */
    private int pagoTotal;
    /**
     * la variable sueldoBase almacena el valor del sueldo base del trabajador
     */
    private int sueldoBase;
    /**
     * la variable valorIdioma almacena el valor por cada idioma que domine el
     * trabajador
     */
    private int valorIdioma;
    /**
     * la variable horasTrabajadas almacena el numero de horfas trabajadas
     */
    private int horasTrabajadas;

    public Pago() {

    }

    @PostConstruct
    public void Pago() {
        this.nombre = informacion.getNombre();
        this.apellido = informacion.getApellido();
        this.cedula = informacion.getCedula();
        this.fechaNacimiento = informacion.getFechaNacimiento();
        this.idiomas = informacion.getIdiomas();
        this.nivelEstudios = informacion.getNivelEstudios();
        this.horasTrabajadas = informacion.getHorasTrabajadas();
        this.valorIdioma = 10000;
        this.sueldoBase = 30000;
        this.pagoTotal = 0;
        totalSueldo();
    }

    /**
     * Metodo que calcula cuanto dinero se debe sumar segun el nivel academico
     *
     * @return total valor deacuerdo al nivel academico
     */
    private int totalNivelAcademico() {
        int total;
        switch (this.nivelEstudios) {
            case "tecnico":
                total = 5000;
                break;
            case "tecnologo":
                total = 15000;
                break;
            case "profesional":
                total = 30000;
                break;
            case "magister":
                total = 40000;
                break;
            default:
                total = 0;
                break;
        }

        return total;
    }

    /**
     * Metodo que calcula cuanto dinero se debe sumar segun la cantidad de
     * idiomas
     *
     * @return valorIdioma el valor total deacuerdo a los idiomas que domine
     */
    private int totalIdioma() {
        int cantidadIdiomas, valorIdiomas;
        cantidadIdiomas = this.idiomas.size();

        valorIdiomas = valorIdioma * cantidadIdiomas;

        return valorIdiomas;
    }

    /**
     * Metodo que calcula el saldo total segun los datos
     */
    private void totalSueldo() {
        int totalIdioma, totalNivel;

        totalIdioma = totalIdioma();
        totalNivel = totalNivelAcademico();

        this.pagoTotal = (totalIdioma + totalNivel + this.sueldoBase) * this.horasTrabajadas;

    }

    /**
     * Metodo para mostrar los valores que se ingresaron en el formulario
     * @return informacion retorna los valores ingresados en el formulario 
     */
    public Index getInformacion() {
        return informacion;
    }

    /**
     * Metodo para modificar los valores que se ingresaron en el formulario
     * @param informacion valores ingresados en el forumulario a modificar
     */
    public void setInformacion(Index informacion) {
        this.informacion = informacion;
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
     * Metodo para mostrar el valor de la cedula del trabajador
     * @return cedula retorna el valor de la cedula del trabajador
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
     * Metodo para mostrar el valor del nivel de estudio del trabajador
     * @return nivelEstudios retorna el valor del nivel de estudio del
     * trabajador
     */
    public String getNivelEstudios() {
        return nivelEstudios;
    }

    /**
     * Metodo para modificar el valor del nivel de estudio del trabajador
     * @param nivelEstudios valor del nivel de estudio del trabajador a
     * modificar
     */
    public void setNivelEstudios(String nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
    }

    /**
     * Metodo para mostrar los idiomas que domina el trabajador
     * @return idiomas retorna el array de idiomas que domina el trabajador
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
     * Metodo para mostrar el valor del pago total del trabajador
     * @return sueldoBase retorna el valor del pago total del trabajador
     */
    public int getPagoTotal() {
        return pagoTotal;
    }

    /**
     * Metodo para modificar el valor del pago total del trabajador
     * @param pagoTotal valor del pago totale del trabajador a modificar
     */
    public void setPagoTotal(int pagoTotal) {
        this.pagoTotal = pagoTotal;
    }

    /**
     * Metodo para mostrar el valor del sueldo base del trabajador
     * @return sueldoBase retorna el valor del sueldo base del trabajador
     */
    public int getSueldoBase() {
        return sueldoBase;
    }

    /**
     * Metodo para modificar el valor del sueldo base del trabajador
     * @param sueldoBase valor del sueldo base del trabajador a modificar
     */
    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    /**
     * Metodo para mostrar el valor de la fecha de nacimiento del trabajador
     * @return fechaNacimiento retorna el valor de la fecha de nacimiento del
     * trabajador
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Metodo para modificar el valor de la fecha de nacimiento del trabajador
     * @param fechaNacimiento valor de la fecha de nacimiento del trabajador a
     * modificar
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
     * @param horasTrabajadas valor de horas trabajadas a modificar
     */
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * Metodo para mostrar el valor a pagar por los idiomas
     * @return valorIdioma retorna el valor a pagar de los idiomas
     */
    public int getValorIdioma() {
        return valorIdioma;
    }

    /**
     * Metodo para modificar el valor a pagar por los idiomas
     * @param valorIdioma valor a pagar por los idiomas a modificar
     */
    public void setValorIdioma(int valorIdioma) {
        this.valorIdioma = valorIdioma;
    }
}
