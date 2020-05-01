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
    private int numeroIdiomas;

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
        this.numeroIdiomas= informacion.getIdiomas().size();
        this.sueldoBase = 30000 *20;
        this.pagoTotal = 0;
//        hallarPagoTotal();
        
    }
    
//    public int hallarPagoTotal(){
//      switch (this.nivelEstudios) {
//                case "tecnico":
//                this.pagoTotal = 5000 + (10000 * this.numeroIdiomas)+ this.sueldoBase;
//                break;
//            case "tecnologo":
//                this.pagoTotal = 15000 + (10000 * this.numeroIdiomas)+this.sueldoBase;
//                break;
//            case "profesional":
//                this.pagoTotal = 30000 + (10000 * this.numeroIdiomas)+this.sueldoBase;
//                break;
//            case "magister":
//                this.pagoTotal = 40000 + (10000 * this.numeroIdiomas)+this.sueldoBase;
//                break;
//            default:
//                this.pagoTotal = 40000 + (10000 * this.numeroIdiomas)+this.sueldoBase;
//                break;
//        
//       }
//        return this.pagoTotal;
//    }

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

    public int getNumeroIdiomas() {
        return numeroIdiomas;
    }

    public void setNumeroIdiomas(int numeroIdiomas) {
        this.numeroIdiomas = numeroIdiomas;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
