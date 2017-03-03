/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c12n06;

/**
 *
 * @author Ben Slater
 */
public class C12N06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("A5");
        System.out.println("FAA");
        System.out.println("T10");
        System.out.println("ABC");
        System.out.println("10A");
    }

    public static int hex2Dec(String hexString) {
        int value = convertHexToDec(hexString.charAt(0));
        for (int i = 1; i < hexString.length(); i++) {
            value = value * 16 + hexString.charAt(i) - '0';
        }
    
    return value ;

}

static int convertHexToDec(char ch) {
        if (ch == 'A') {
            return 10;
        }
        else if (ch == 'B'){
            return 11;
        }
        else if (ch == 'C'){
            return 12;
        }
        else if (ch == 'D'){
            return 13;
        }
        else if (ch == 'E'){
            return 14;
        }
        else if (ch == 'F'){
            return 15;
        }
        else if (ch <= '9' && ch >= '0')
            return ch - '0';
        else
            throw new NumberFormatException("Illegal character: " + ch);
    }
        
        
        
        
        
        
        
        
        
        
        
    }
    
    

