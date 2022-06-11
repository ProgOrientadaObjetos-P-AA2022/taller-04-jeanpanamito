/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4;

/**
 *
 * @author jeanpanamito
 */
public class Cheques {
    private String nombre;
    private String banco;
    private double valorCheque;
    private double comision;

    public Cheques() {
        nombre = "Paula Balcázar";
        banco = "Banco de Pichincha";
        valorCheque = 320700.90;
    }

    public Cheques(String a, String b,double c) {
        nombre = a;
        banco = b;
        valorCheque = c;
       } 

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerBanco(String c) {
        banco = c;
    }

    public void establecerValorCheque(double c) {
        valorCheque = c;
    }

    public void calcularComision() {
        comision = (valorCheque *0.003)/100 ;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerBanco() {
        return banco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {

        String cadena = String.format("Cheque\n"
                + "Nombre del Cliente: %s\n"
                + "Nombre del Banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Valor de la comision: %.2f\n",
                obtenerNombre(),
                obtenerBanco(),
                obtenerValorCheque(),
                obtenerComision());
        return cadena;
    }
}
