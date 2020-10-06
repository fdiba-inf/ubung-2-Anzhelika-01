package exercise2;

import java.util.Scanner;

  public class Circle{

    public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      double radius = input.nextDouble();
      double c = 2.0 * Math.PI * radius;
      double a = Math.PI * radius * radius;
      
      System.out.println("Circumference: " + c);
      System.out.print("Area: " + a);
    }
  }