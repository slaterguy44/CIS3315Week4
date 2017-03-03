/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c12n19;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 55slaterbc30
 */
public class C12N19 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        URL url = null;
        try {
            url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
        } catch (MalformedURLException ex) {
            Logger.getLogger(C12N19.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner sc = new Scanner(url.openStream());
        
        int count=0;
    while(sc.hasNext()){
       String word = sc.next();
        if(!word.contains("\\"))
            count++;
    }
System.out.println("Number of words: " + count);
}
    }


