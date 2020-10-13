/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio1_scanner;
import java.util.*;
/**
 *
 * @author marti
 */
public class Ejercicio1_Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Dame tu nombre ");
        String name= lee.nextLine();
        System.out.println("Tu nombre es: " + name);
        System.out.println("Dame tu edad: ");
        Float edad = lee.nextFloat();
        System.out.println("Tu edas es: " + edad);
        System.out.println("Dime tu saldo");
        Float saldo = lee.nextFloat();
        System.out.println("Tu saldo es: "+ saldo);
        
        
         
       
        System.out.println("Dame tu edad: ");
        Float edad2 = lee.nextFloat();
        lee.nextLine();
        System.out.println("Dame tu nombre ");
        String name2= lee.nextLine();
        System.out.println("Tu nombre es: " + name2);
        System.out.println("Tu edas es: " + edad2); 
    }
    
}
