package Proyecto_1;
import java.util.Scanner;

public class Proyecto_loxxO 
{
    public static void main(String[] args)
    {
        int CodigoCliente;
        String nombre;
        String apellidoPaterno;
        String apellidoMaterno;
        String telefono;
        String direccion;
        int edad;        
        int n;      
        int tamanio =0 ;
        
        boolean valido;
        
        String posicion[][];
        //String lugar[];
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print(" Ingrese el tamaño de la cartera: ");
        n = Integer.parseInt(sc.nextLine());
        //System.out.print("Ingrese el segundo tamaño");
        //j = Integer.parseInt(sc.nextLine());
        
        for(int i=0; i<n; i++)
        {
            posicion = new String[n][5];
            //lugar = new String[n];
            
            System.out.println("El tamaño de la cartera restante es de " + n);
            System.out.println("-----------Menu-------------");
            System.out.println("1.- Agragar cliente");
            System.out.println("2.- Mostrar clientes");
            System.out.println("3.- Buscar cliente");
            System.out.println("4.- Cerrar sistema");
            int resp= Integer.parseInt(sc.nextLine());
        
            switch (resp)
            {
                case 1: //Agregar Cliente
                    tamanio = n-1;
                    
                    System.out.println("Su tamaño de cartera es: + tamanio");
                    System.out.println(" ID :" + i);
                    
                    System.out.print("Introduce el nombre: ");
                    nombre=sc.nextLine();
                    nombre=posicion[i][0];
                            
                    System.out.print("Introduce el Apellido Paterno: ");
                    apellidoPaterno = sc.nextLine();
                    posicion[i][1]=apellidoPaterno;
                    
                    System.out.print("Introduce el Apellido Materno: ");
                    apellidoMaterno = sc.nextLine();
                    posicion[i][2]=apellidoMaterno;
                    
                    System.out.print("Introduce el Telefono: ");
                    telefono = sc.nextLine();
                    posicion[i][3]=telefono;
                    
                    System.out.print("Introduce el Direccion: ");
                    direccion = sc.nextLine();
                    posicion[i][4]=direccion;
                    
                    //do
                    //{
                        //try
                        //{
                            System.out.print("Introduce el Edad: ");
                            posicion[i][5] = (sc.nextLine());
                            //edad = Integer.parseInt(sc.nextLine());
                            //valido=true;
                        //}
                        //catch(Exception e)
                        //{
                            //System.out.print("Edad no valida: ");
                            //valido = false;
                        //}
                    //}
                    //while(valido == false);
                    
                case 2:
                    //Mostrar clientes 
                    for(i=0; i<n; i++)
                    {
                        System.out.print(" ID: " + i );
                        System.out.print("Nombre: " + posicion[i][0]);
                        System.out.print("Apellido Paterno: " + posicion[i][1]);
                        System.out.print("Apellido Materno: " + posicion[i][2]);
                        System.out.print("Telefono: " + posicion[i][3]);
                        System.out.print("Direccion: " + posicion[i][4]);
                        System.out.print("Edad: " + posicion[i][5]);                          
                    }
                case 3:
                    //Buscar clientes
                    System.out.print("Ingrese el ID del usuario a buscar: ");
                    int opcion3=sc.nextInt();
                    sc.nextLine();
                    
                    if(opcion3==i)
                    {
                        System.out.print(" ID: " + i );
                        System.out.print("Nombre: " + posicion[i][0]);
                        System.out.print("Apellido Paterno: " + posicion[i][1]);
                        System.out.print("Apellido Materno: " + posicion[i][2]);
                        System.out.print("Telefono: " + posicion[i][3]);
                        System.out.print("Direccion: " + posicion[i][4]);
                        System.out.print("Edad: " + posicion[i][5]);
                    }
                case 4:
                   //Cerrar Sistema 
 	            System.out.println("Saliste del programa, te deseo un buen dia");
		    break;
		    default:
	            System.out.println("No es una opcion del menu");                   
            }
        }
    }
}
