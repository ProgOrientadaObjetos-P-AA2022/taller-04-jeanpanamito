/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

/**
 *
 * @author jeanpanamito
 */
public class Matricula {

    private String cedula;
    private String marca;
    private int año;
    private double valorVehiculo;
    private double valorMatricula;

    public Matricula() {
        cedula = "110947909";
        marca = "Audi";
        año = 2020;
        valorVehiculo = 132443.34;
    }

    public Matricula(String a, String b, int c, double d) {
        cedula = a;
        marca = b;
        año = c;
        valorVehiculo = d;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerMarca(String c) {
        marca = c;
    }

    public void establecerAño(int c) {
        año = c;
    }

    public void establecerValorVehiculo(double c) {
        valorVehiculo = c;
    }

    public void calcularValorMatricula() {
        valorMatricula = (valorVehiculo * 0.002) * (2022 - año);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAño() {
        return año;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {

        String cadena = String.format("Valor de la Matricula del Vehiculo\n"
                + "Cédula del dueño: %s\n"
                + "Marca del vehículo: %s\n"
                + "Año de fabricación: %d\n"
                + "Valor del vehiculo: %.2f\n"
                + "Por lo tanto, el valor de Matricula del vehiculo es %.2f\n",
                obtenerCedula(),
                obtenerMarca(),
                obtenerAño(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());
        return cadena;
    }
}
