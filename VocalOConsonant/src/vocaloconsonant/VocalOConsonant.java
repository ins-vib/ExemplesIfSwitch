package vocaloconsonant;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * L'usuari introdueix un caràcter per pantalla i el programa diu si és una
 * vocal o no
 * @author joan
 */
public class VocalOConsonant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introdueix un caràcter: ");
        char lletra = entrada.next().charAt(0);
       
        if ( lletra == 'a' || lletra == 'e' || lletra == 'i' || lletra == 'o' || lletra == 'u'
            || lletra == 'A' || lletra == 'E' || lletra == 'I' || lletra == 'O' || lletra == 'U')
            System.out.println("És una vocal");
        else
            System.out.println("No és una vocal");
        
    }
    
}
