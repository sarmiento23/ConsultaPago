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
 * @author Valentina
 */
@ManagedBean(name = "pago")
@RequestScoped
public class Pago implements Serializable {

    @ManagedProperty("#{index}")
    private Index informacion;

    private String nombre;
    private String apellido;
    private int cedula;
    private Date fechaNacimiento;
    private String nivelEstudios;
    private ArrayList idiomas;
    private int pagoTotal;
    private int sueldoBase;
    private int valorIdioma;
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
     * @return
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
     * @return
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

    public Index getInformacion() {
        return informacion;
    }

    public void setInformacion(Index informacion) {
        this.informacion = informacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNivelEstudios() {
        return nivelEstudios;
    }

    public void setNivelEstudios(String nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
    }

    public ArrayList getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList idiomas) {
        this.idiomas = idiomas;
    }

    public int getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(int pagoTotal) {
        this.pagoTotal = pagoTotal;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorIdioma() {
        return valorIdioma;
    }

    public void setValorIdioma(int valorIdioma) {
        this.valorIdioma = valorIdioma;
    }
}
