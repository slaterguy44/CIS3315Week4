/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c11n14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 55slaterbc30
 */
public class C11N14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listOne = new ArrayList<Integer>();
        System.out.println("Enter 5 integers to merge");
        for(int i = 0; i< 5; i++)
        listOne.add(sc.nextInt());
        
        ArrayList<Integer> listTwo = new ArrayList<Integer>();
        System.out.println("Enter 5 more integers to merge");
        for (int i = 0; i<5; i++)
            listTwo.add(sc.nextInt());
        
    
        ArrayList<Integer> arrayList = add(listOne, listTwo);
        
        System.out.print("The Combined list is ");
        for(int i = 0; i<arrayList.size(); i++)
            System.out.print(arrayList.get(i) + " ");
        
        }

public static ArrayList<Integer> add(
ArrayList<Integer> listOne, ArrayList<Integer> listTwo) {
        ArrayList<Integer> result = new ArrayList<>();

for(int i = 0; i< listOne.size(); i++)
    result.add(listOne.get(i));

for(int i = 0; i<listTwo.size(); i++)
    result.add(listTwo.get(i));

return result;
}   
}   

