/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

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
        Matricula v1 = new Matricula();
        v1.calcularValorMatricula();

        Matricula v2 = new Matricula("1143343433", "Chevrolet", 2019, 9700.93);
        v2.calcularValorMatricula();

        System.out.printf("%s\n%s\n", v1, v2);

    }

}
