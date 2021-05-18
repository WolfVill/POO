/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

/**
 *
 * @author pc-1
 */
public abstract class Persona {
String nombre="Jose";
int edad=20;
int cedula=123456;

    public Persona(String nombre, int cedula, int edad) {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public boolean esMayorEdad(){
    boolean pase=false;

    if(this.edad>=18) {
        pase=true;
    }
        return pase;

    }
}
