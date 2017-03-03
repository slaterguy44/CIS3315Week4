/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c12n03;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 55slaterbc30
 */
public class C12N03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] randArray = new int[100];
        Random gen = new Random();
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = gen.nextInt();
        }
        System.out.println("Enter an index");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        try {
            int result = randArray[index];
            System.out.println("The number is " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }

    }

}
