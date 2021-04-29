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
public class Mamifero extends Animal{

    protected String tamano;
    public Mamifero()
    {
        super(); 
    }
    
    public Mamifero(String Color, String tamano) 
    {
        super(Color);
        this.tamano = tamano;
    }  
    
    public Mamifero(String tamano)
    {
        super();
        this.tamano = tamano;
    }    

    void setColor(String azul) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setTamano(String grande) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean getTamano() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
