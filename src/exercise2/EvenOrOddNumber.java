package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num = input.nextDouble();
        if(num % 2 == 0){
            System.out.print("Number is even");
        }
        else{
          System.out.print("Number is odd");
        }
    }
}