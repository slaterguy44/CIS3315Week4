/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c12n24;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 55slaterbc30
 */
public class C12N24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Random rand = new Random();
        PrintWriter out = new PrintWriter("Salary.txt");

        int people = 1000;
        for (int i = 0; i < people; i++) {
            out.print("FirstName" + i + "LastName" + i);
            int pos = (int) (Math.random() * 3);

            if (pos == 0) {
                double salary = 50000 + Math.random() * 30000;
                out.printf("assistant %.2f", salary);
            } else if (pos == 1) {
                double salary = 60000 + Math.random() * 50000;
                out.printf("associate professor %.2f", salary);
            } else if (pos == 2) {
                double salary = 75000 + Math.random() * 55000;
                out.printf("Professor %.2f", salary);
            } else {
                System.out.println("Error");
            }
               if(i < people){
                   out.println();
        }
        }
        System.out.println("Done");
}
}