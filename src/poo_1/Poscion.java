/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_1;
import java.util.Scanner;
/**
 *
 * @author pc-1
 */
public class Poscion 
{
    public static void main(String[] args)
    {
      int numero;
      
      Scanner sc = new Scanner(System.in);
      int[] posicion = new int[11];
      
      for(int i = 1; i < 11; i++)
      {
         System.out.print(" Ingrese el numero " + i + ": ");
         posicion[i] = sc.nextInt();
      }
      
      System.out.print(" Ingrese el numero a localizar: ");
      numero=sc.nextInt();
      
      if(numero <= numero)
      {
         System.out.print(" El numero " + numero + " esta en la posicion " + posicion[numero]);  
      }
    }
}
