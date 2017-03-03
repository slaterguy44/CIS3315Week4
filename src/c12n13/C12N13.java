/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c12n13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 55slaterbc30
 */
public class C12N13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name: test.txttext.txt");
        
        String input = sc.next();
        File file = new File(input);
        Scanner in = new Scanner(file);

        int words = 0;
        int lines = 0;
        int chars = 0;

        while (in.hasNext()) {
            in.next();
            words++;
        }

        while (in.hasNextLine()) {
            in.hasNextLine();
            lines++;
        }

        while (in.hasNextByte()) {
            in.hasNextByte();
            chars++;
        }
        
        System.out.println("Number of lines: " + lines);
        System.out.println("Number of words: " + words);
        System.out.println("Number of characters: " + chars);
    }

}
