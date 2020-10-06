package exercise2;

import java.util.Scanner;

public class SumOfDigits {
  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    int d1 = number % 10;
    number = number / 10;
    int d2 = number % 10;
    int sum = d1 + d2 + number;
    System.out.print("Sum of digits: " + sum);
  }
} 