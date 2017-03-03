/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c12n15;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 55slaterbc30
 */
public class C12N15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       int[] arrayOne = new int[100];
       Random gen = new Random();
       for(int i = 0; i<100; i++){
           arrayOne[i] = gen.nextInt();
       }
       PrintWriter out = new PrintWriter(new File("C12N15.txt"));
       for (int myNum : arrayOne){
           out.print(myNum + " ");
       }
       out.println();
       out.close();
       
       int[]arrayTwo = new int[100];
       Scanner sc = new Scanner(new File("C12N15.txt"));
       
    }
    
}
