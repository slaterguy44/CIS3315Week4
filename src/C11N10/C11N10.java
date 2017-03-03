/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C11N10;

import java.util.Scanner;

/**
 *
 * @author 55slaterbc30
 */

   

public class C11N10 {
  public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);
    
    MyStack stack = new MyStack();
      System.out.println("Enter 5 Strings");
    for (int i = 0; i < 5; i++)
      stack.push(sc.nextLine());
    
    System.out.println(stack.getSize() + " strings are: ");
    while (!stack.isEmpty())
      System.out.println(stack.pop());
  }
}

// MyStack.java: Implementing a stack using inheritance
class MyStack extends java.util.ArrayList<Object> {
  public boolean isEmpty() {
    return super.isEmpty();
  }

  public int getSize() {
    return size();
  }

  public Object peek() {
    return get(getSize() - 1);
  }

  public Object pop() {
    return remove(getSize() - 1);
  }

  public Object push(Object o) {
    add(o);
    return o;
  }

  public int search(Object o) {
    return indexOf(o);
  }

  public String toString() {
    return "stack: " + toString();
  }
}


