/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c11n12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 55slaterbc30
 */
public class C11N12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> arrayList = new ArrayList<Double>();
        System.out.println("Enter 5 integers to sum, press q to quit");
        while (sc.hasNextDouble()) {
            double i = sc.nextDouble();
            arrayList.add(i);
        }
        double sum = 0;
        for(int i = 0; i< arrayList.size(); i++)
        {
            sum += arrayList.get(i);
        }
        System.out.println(sum);
    }
    
}
