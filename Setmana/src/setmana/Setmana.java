/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setmana;

import java.util.Scanner;

/**
 * L'usuari introdueix el número de dia de la setmana i el programa respon si
 * és cap de setmana o no
 * @author joan
 */
public class Setmana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introdueix un número de dia de la setmana");
        
        int dia = entrada.nextInt();
        
        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("No és cap de setmana");
            case 6:
            case 7:
                System.out.println("És cap de setmana");
                break;
            default:
                System.out.println("No és un dia de la setmana");
        }
        
    }
    
}
