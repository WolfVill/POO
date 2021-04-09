/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_1;

public class Menus 
{
    private int CodigoCliente;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String telefono;
    private String direccion;
    private int edad;

    public Menus() 
    {
    }

    public Menus(int CodigoCliente, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String direccion, int edad) 
    {
        this.CodigoCliente = CodigoCliente;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;
    }

    public void setCodigoCliente(int CodigoCliente) 
    {
        this.CodigoCliente = CodigoCliente;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public String getApellidoPaterno()
    {
        return apellidoPaterno;
    }
    
    public void setApellidoPaterno(String apellidoPaterno)
    {
        this.apellidoPaterno=apellidoPaterno;
    }
    
    public String getApellidoMaterno()
    {
        return apellidoMaterno;
    }
    
    public void setApellidoMaterno(String apellidoMaterno)
    {
        this.apellidoMaterno=apellidoMaterno;
    }
    
    public String getTelefono()
    {
        return telefono;
    }
    
    public void setTelefono(String telefono)
    {
        this.telefono=telefono;
    }
    
    public String getDireccion()
    {
        return direccion;
    }
    
    public void setDireccion(String direccion)
    {
        this.direccion=direccion;
    }
    
    public int getEdad()
    {
        return edad;
    }
    
    public void setEdad(int edad)
    {
        this.edad=edad;
    }
}
