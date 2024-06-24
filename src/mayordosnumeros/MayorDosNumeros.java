/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayordosnumeros;

import java.util.Scanner;

/**
 *
 * @author ben10
 */
public class MayorDosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declaracion de variable*/
        int numero1;
        int numero2;
        int numeroMayor;
        Scanner valores = new Scanner(System.in);
        
        //Proporcionar numero 1
        System.out.println("Proporciona el numero 1:");
        numero1 = valores.nextInt();
        
        //Proporcionar numero 2
        System.out.println("Porporciona el numero 2:");
        numero2 = valores.nextInt();
        
        //Evaluar cual numero es el valor
        numeroMayor = numero1 > numero2 ? numero1 : numero2;
        
        //Mostrar el numero mayor
        System.out.println("El numero mayor es: " + numeroMayor);
    }
    
}
