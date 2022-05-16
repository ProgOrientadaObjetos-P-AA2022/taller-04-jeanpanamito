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
public class ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     registroEstudiante est1 = new  registroEstudiante();
        est1.calcularPromedio();

        registroEstudiante est2 = new  registroEstudiante("Rene Elizalde",
                9.48, 8.63, 9.15);
        est2.calcularPromedio();

        System.out.printf("Registro estudiante   %s\n", est1);
        System.out.println("=============================");
        System.out.printf("Registro estudiante %s\n", est2);
    }
    
}
