/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edat;

import java.util.Scanner;

/**
 * L'usuari ha d'introduir per teclat un preu d'entrada i una edat. Els menors
 * de 2 anys no paguen, fins a 9 anys hi ha un 50% de descompte, fins als 18 un
 * 10% de descompte i a partir de 65 anys un 40% de descompte.
 * @author joan
 */
public class Edat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Preu entrada: ");
        double preu = entrada.nextDouble();
        
        System.out.println("Edat: ");
        int edat = entrada.nextInt();
        int descompte = 0;
        
            
        if ( edat <= 2) {
            descompte = 100;
        } else if  ( edat <= 9 ) {
            descompte = 50;
        } else if ( edat <= 18 ) {
            descompte = 10;
        } else if ( edat >= 65 ) {
            descompte = 40;
        }
        
        double preuFinal = preu - preu * descompte / 100;
        System.out.println("El preu final és " + preuFinal + " €");
        
        
    }
    
}
