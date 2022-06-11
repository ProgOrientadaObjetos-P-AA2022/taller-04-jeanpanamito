/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

/**
 *
 * @author jeanpanamito
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Calificaciones alum1 = new Calificaciones();
        alum1.calcularPromedio();

        Calificaciones alum2 = new Calificaciones("Rene Elizalde", 9.4, 8.3,9.9);
        alum2.calcularPromedio();

        System.out.printf("%s\n%s\n", alum1, alum2);
    }

}
