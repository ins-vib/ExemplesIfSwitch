package SeleccionaOperacio;

import java.util.Scanner;

public class SeleccionaOperacio {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Quina operació vols fer? ");
        System.out.println("[1] Sumar");
        System.out.println("[2] Restar");
        System.out.println("Selecciona l’opció:");
        int opcio = lector.nextInt();
        
        if (opcio == 1) {
            System.out.println("Has triat sumar ...");
        }
        if (opcio == 2) {
            System.out.println("Has triat restar....");
        }
        if (opcio != 1 && opcio != 2) {
            System.out.println("Opció no prevista");
        }
        if (opcio == 1) {
            System.out.println("Has triat sumar ...");
        } else {
            if (opcio == 2) {
                System.out.println("Has triat restar....");
            } else {
                System.out.println("Opció no prevista");
            }
        }
        
        

        switch (opcio) {
            case 1:
            case 3:
            case 5:
                System.out.print("Has triat sumar ...");
                break;
            case 2:
                System.out.print("Has triat restar....");
                break;
            default:
                System.out.println("Opció no prevista");

        }
        System.out.println("\nFi");
      
      
    }

}
