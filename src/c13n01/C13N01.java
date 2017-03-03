/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c13n01;

/**
 *
 * @author 55slaterbc30
 */
public class C13N01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}

abstract class GeometricObject{
    private String color;
    private boolean colored;

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.colored = filled;
    }

    public boolean isFilled() {
        return colored;
    }

    public void setFilled(boolean filled) {
        this.colored = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "GeometricObject{" + "color=" + color + ", filled=" + colored + '}';
    }
    
    
    
    
    
    
    
}