/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial_2;

/**
 *
 * @author pc-1
 */
public class Main {
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        System.out.println(animal.getColor());
        
        Mamifero mamifero1 = new Mamifero();
        mamifero1.setColor("Azul");
        mamifero1.setTamano("Grande");
        System.out.println(mamifero1.getColor());
        System.out.println(mamifero1.getTamano());        
    }
}
