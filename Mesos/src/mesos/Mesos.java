package mesos;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * L'usuari entra per teclat el número de mes i el programa imprimeix el nom
 * @author joan
 */
public class Mesos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introdueix un número de mes");
        int mes = entrada.nextInt();
        if ( mes == 1 )
            System.out.println("Gener");
        else if ( mes == 2 )
            System.out.println("Febrer");
        else if ( mes == 3 )
            System.out.println("Març");
        else if ( mes == 4 )
            System.out.println("Abril");
        else if ( mes == 5 )
            System.out.println("Maig");
        else if ( mes == 6 )
            System.out.println("Juny");
        else if ( mes == 7 )
            System.out.println("Juliol");
        else if ( mes == 8 )
            System.out.println("Agost");
        else if ( mes == 9 )
            System.out.println("Setembre");
        else if ( mes == 10 )
            System.out.println("Octubre");
        else if ( mes == 11 )
            System.out.println("Novembre");
        else if ( mes == 12 )
            System.out.println("Desembre");
      
    }
    
}
