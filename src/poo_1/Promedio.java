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
public class Promedio 
{
    public static void main(String[] args)
    {
        double divicion;
        double operacion=0;
        int n;
        
        Scanner sc = new Scanner (System.in);
        boolean validar = false;
        
	    System.out.print(" Cuantos datos desea capturar00 : ");
	    n = Integer.parseInt(sc.nextLine());;
        
	int[] promedio = new int[n];
        
	for(int i =0; i<n; i++)
        {
	    System.out.print("Introduce el promedio " + (i+1)+": ");
            promedio[i] = Integer.parseInt(sc.nextLine());
	}
        
	for(int i =0; i<n; i++)
        {
            operacion += promedio[i];	
	}
        
	divicion = operacion/n;
	System.out.println("El promedio es: " + divicion);       
    }
}
