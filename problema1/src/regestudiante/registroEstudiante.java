/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regestudiante;

/**
 *
 * @author JEanpa
 */
public class registroEstudiante {
    private String nombre;
    private double materia1;
    private double materia2;
    private double materia3;
    private double promedio;

    public registroEstudiante() {
        nombre = "Jean Paul Panamito";
        materia1 = 8.94;
        materia2 = 9.25;
        materia3 = 7.42;

    }

    public registroEstudiante(String nombre, double materia1, double materia2, double materia3) {
        this.nombre = nombre;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;

    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerMateria1(double c) {
        materia1 = c;
    }

    public void establecerMateria2(double c) {
        materia2 = c;
    }

    public void establecerMateria3(double c) {
        materia3 = c;
    }

    public void calcularPromedio() {
        promedio = (materia1 + materia2 + materia3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerMateria1() {
        return materia1;
    }

    public double obtenerMateria2() {
        return materia2;
    }

    public double obtenerMateria3() {
        return materia3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format(
                "\nNombre del estudiante: \n%s\n"
                + "Calificación Materia 1: \n%.2f\n"
                + "Calificación Materia 2: \n%.2f\n"
                + "Calificación Materia 3:\n%.2f\n"
                + "Promedio de las calificaciones:\n%.2f\n",
                obtenerNombre(), obtenerMateria1(), obtenerMateria2(), obtenerMateria3(), obtenerPromedio());

        return cadena;
    }
}
