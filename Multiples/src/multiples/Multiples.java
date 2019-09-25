/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiples;

import java.util.Scanner;

/**
 * El programa ha de dir si un número entrat des del teclat és múltiple de 2,
 * de 3 o de 4.
 * @author joan
 */
public class Multiples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        System.out.print("Introdueix un número sencer: ");
        
        int numero = entrada.nextInt();
        if (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("És múltiple de 2");
            }
            if (numero % 3 == 0) {
                System.out.println("És múltiple de 3");
            }
            if (numero % 4 == 0) {
                System.out.println("És múltiple de 4");
            }
        }
    }

}
