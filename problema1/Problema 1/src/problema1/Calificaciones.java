/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author jeanpanamito
 */
public class Calificaciones {

    private String nombre;
    private double materiaUno;
    private double materiaDos;
    private double materiaTres;
    private double promedio;

    public Calificaciones() {
        nombre = "Jean Panamito";
        materiaUno = 6.8;
        materiaDos = 5.7;
        materiaTres = 3;
    }

    public Calificaciones(String a, double b, double c, double d) {
        nombre = a;
        materiaUno = b;
        materiaDos = c;
        materiaTres = d;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerMateriaUno(double c) {
        materiaUno = c;
    }

    public void establecerMateriaDos(double c) {
        materiaDos = c;
    }

    public void establecerMateriaTres(double c) {
        materiaTres = c;
    }

    public void calcularPromedio() {
        promedio = (materiaUno + materiaDos + materiaTres) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerMateriaUno() {
        return materiaUno;
    }

    public double obtenerMateriaDos() {
        return materiaDos;
    }

    public double obtenerMateriaTres() {
        return materiaTres;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {

        String cadena = String.format("Las calificaciones del alumno %s son: \n"
                + "Materia 1: %.2f\n"
                + "Materia 2: %.2f\n"
                + "Materia 3: %.2f\n"
                + "Promedio: %.2f\n",
                obtenerNombre(),
                obtenerMateriaUno(),
                obtenerMateriaDos(),
                obtenerMateriaTres(),
                obtenerPromedio());
        return cadena;
    }
}
