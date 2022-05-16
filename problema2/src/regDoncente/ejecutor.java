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
public class ejecutor {

    
    public static void main(String[] args) {
        // TODO code application logic here
     registroDocente doc1 = new  registroDocente();
     doc1.calcularAumento();
     doc1.calcularSueldo();

        registroDocente doc2 = new  registroDocente("Rene Rolando",
                "Elizalde Solano", "1102341678", 900,20);
       doc2.calcularAumento();
        doc2.calcularSueldo();

        System.out.printf("Registro de Docente  %s\n", doc1);
        System.out.println("=============================");
        System.out.printf("Registro de Docente %s\n", doc2);
    }
    
}
