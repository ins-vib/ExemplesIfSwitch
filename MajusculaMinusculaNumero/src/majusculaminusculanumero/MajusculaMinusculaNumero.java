/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majusculaminusculanumero;

import java.util.Scanner;

/**
 * L'usuari ha d'entrar un caràcter per teclat i el programa ha de dir si és
 * una lletra majúscula, minúscula o un número
 * @author joan
 */
public class MajusculaMinusculaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introdueix un caràcter: ");
        char caracter = entrada.next().charAt(0);
        
        if ( caracter >= 'a' && caracter <= 'z' )
            System.out.println("És minúscula");
        else if ( caracter >= 'A' && caracter <= 'Z' )
            System.out.println("És majúscula");
        else if ( caracter >= '0' && caracter <= '9' )
            System.out.println("És un número");
        else 
            System.out.println("És un símbol");
    }
    
}
