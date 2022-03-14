package homework6;

//18. Write a Java program to print the sum (addition), multiply, subtract, divide and  remainder of two numbers.
//Test Data:
//Input first number: 125
//Input second number: 24
//Expected Output :
//125 + 24 = 149
//125 - 24 = 101
//125 x 24 = 3000
//125 / 24 = 5
//125 mod 24 = 5

import java.util.Scanner;

public class Program18 {
    //main method
    public static void main(String[] args) {
        //scanner code
        Scanner Input=new Scanner(System.in);
        System.out.println("Input first number: ");//to print frist number
        double first=Input.nextDouble();

        System.out.println("Input second number: ");//to print second number
        double second=Input.nextDouble();

        System.out.println( "Expected Output: ");//to print expected output

        //to addtion of two value
        double sum1=first + second;
        System.out.println(first+ " + " +second+ " = "+sum1);

        //to subtraction of two value
        double sum2=first - second;
        System.out.println(first+ " - " +second+ " = "+sum2);

        //to multiplication of two value
        double sum3= first * second;
        System.out.println(first+ " * " +second+ " = "+sum3);

        //to division of two value
        double sum4= first / second;
        System.out.println(first+ " / " +second+ " = "+sum4);

        //for remainder of two value
        double sum5= first % second;
        System.out.println(first+ " mod " +second+ " = "+sum5);


    }
}
