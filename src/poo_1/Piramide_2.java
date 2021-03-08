/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1;
import java.util.Scanner;
/**
 *
 * @author pc-1
 */
public class Piramide_2 
{
     public static void main(String[] args) 
     {       
        Scanner sc = new Scanner(System.in);
     
        System.out.print(" Introduzca el numero ");
        int n = sc.nextInt();
        sc.close();
 
        System.out.println();
        for(int altura = 1; altura<=n; altura++)
        {
            //Espacios en blanco
            for(int blancos = 1; blancos<=n-altura; blancos++)
            {
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
     }    
}
