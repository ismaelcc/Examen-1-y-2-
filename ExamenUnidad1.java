/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenunidad1;
import java.util.Scanner;

public class ExamenUnidad1 {

    
    public static void main(String[] args) {
        
        Scanner precio  = new Scanner (System.in);
        
        System.out.println("ingrese el nombre del videojuego");
        String videojuego1 = precio.nextLine();
        System.out.println("ingrese el precio del producto");
        double pre1 = precio.nextDouble();
       
        precio.nextLine();
        System.out.println("ingrese el nombre del segundo videojuego");
        String videojuego2 = precio.nextLine();
        System.out.println("ingrese el precio del segundo videojuego");
        double pre2 = precio.nextDouble();
       
        precio.nextLine();
         System.out.println("ingrese el nombre del videojuego");
        String videojuego3 = precio.nextLine();
        System.out.println("ingrese el precio del producto");
        double pre3 = precio.nextDouble();
        precio.nextLine();
        
        double p1 = pre1 *.30;
        double p2 = pre2 *.65;
        double p3 = pre3 *.15;
        
        
               
                
        System.out.println("el precio del primer producto es: " + p1);
        System.out.println("el precio del segundo producto es: " + p2);
        System.out.println("el precio del tercer producto es: " + p3);
        
        
        
        
    }
    
}
