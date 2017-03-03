/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c11n11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 55slaterbc30
 */
public class C11N11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        System.out.println("Enter 5 integers, press q to quit");
        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            arrayList.add(i);
        }
        Collections.sort(arrayList);
        
        System.out.println(arrayList);
    }

}
