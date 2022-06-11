/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regDoncente;

/**
 *
 * @author JEanpa
 */
public class registroDocente {
    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double aumento;
    private double sueldoFinal;
    

    public registroDocente() {
        nombre = "Jean Paul";
        apellido = "Panamito Rueda";
        cedula = "1101753471";
        sueldoBasico = 100;
        aumento = 20;

    }

    public registroDocente(String nombre, String apellido,String cedula, 
            double sueldoBasico, double aumento) {
        this.nombre = nombre;
        this.apellido=apellido;
        this.cedula=cedula;
        this.sueldoBasico=sueldoBasico;
        this.aumento=aumento;
       
        

    }

  

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerSueldo(double c) {
        sueldoBasico = c;
    }
    public void establecerAumento(double c) {
        aumento = c;
    }
    public void calcularAumento() {
        aumento = (sueldoBasico*aumento)/100;
    }
     public void calcularSueldo() {
        sueldoFinal = sueldoBasico+aumento;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }
    public double obtenerAumento() {
        return aumento;
    }
    public double obtenerSueldo() {
        return sueldoFinal;
    }

    @Override
     public String toString() {
        String cadena = String.format("\nNombre: %s\n"
                + "Apellido: %s\n"
                + "Cédula: %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Valor Aumento: %.2f\n"
                + "Sueldo total: %.2f\n", obtenerNombre(), obtenerApellido(), 
                obtenerCedula(), obtenerSueldoBasico(),aumento, sueldoFinal);
        return cadena;
    }
}
