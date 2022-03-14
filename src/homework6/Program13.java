package homework6;

//13. Write a Java program that takes three numbers as input to calculate and  print the average of the numbers.

import java.util.Scanner;

public class Program13 {
    //main method

    public static void main(String[] args) {
        //scanner code


        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the first value = ");
        double first = Input.nextDouble();

        System.out.println("Enter the second value = ");
        double second = Input.nextDouble();

        System.out.println("Enter the third value = ");
        double third = Input.nextDouble();

        //formula for average : (1st+2nd+3rd value)/3
        double average= ((first+second+third)/3);

        System.out.println("Average value: "+average);

    }
}
