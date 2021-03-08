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
    int num;
    int i;
    int j;
    int n;
    
    System.out.print("Ingrese la cantidad de números: ");
    n = sc.nextInt();
    
    int[] numeros = new int[n + 1];
    
    for(i = 1; i < n; i++)
    {
      System.out.print("Ingrese el numero: ");
      numeros[i] = sc.nextInt();
    }
    for(i = 1; i < n; i++)
    {
      for(j = i; j < n; j++)
    {
    if(numeros[i] < numeros[j])
    {
      num = numeros[i];
      numeros[i] = numeros[j];
      numeros[j] = num;
    }
    }
    }
    System.out.println("\nLos números de mayor a menor son:");
    for(i = 1; i < n; i++)
      {
        System.out.println(numeros[i]);
      }
   }    
  }
