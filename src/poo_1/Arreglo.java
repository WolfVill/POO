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
public class Arreglo 
{
   public static void main(String[] args) 
   {  
    Scanner sc = new Scanner(System.in); 
    
    int [] a  = {7,2,4,8,3,9,1,5,10,6};
    int menor;
    int n; 
    
    for(int i = 0; i < 10; i++)
    {
        menor = a[0];

        if (a[i] < menor)
        {
            menor = a[i];
        }
        else
        {
            if (a[i] > menor)
            {
              menor = menor;
            }      
        }
    }
    //System.out.println(Arrays.toString(a));
   }
}
