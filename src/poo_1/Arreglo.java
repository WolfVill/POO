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
public class Arreglo 
{
   public static void main(String[] args) 
   {  
    Scanner sc = new Scanner(System.in); 
    int n;
    int numero[];
    
    System.out.print(" Ingrese la cantidad de numeros: ");
    n=sc.nextInt();
    
    for(int i=0; i<n; i++)
    {
      numero=new int [n];
      System.out.print(" Ingrese el numero: ");
      numero[i]=sc.nextInt();
    }
    System.out.println();
   }
}
