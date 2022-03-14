package homework6;

//15. Write a Java program to swap two variables.


import java.util.Scanner;

public class Program15 {


    //main method
    public static void main(String[] args) {
        //scanner code
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a = ");//to print value
        int a = sc.nextInt();
        System.out.println("Enter the value of b = ");//to print second value
        int b = sc.nextInt();
        int exmp;//variable
        exmp = a;
        a = b;
        b = exmp;
        System.out.println("After swapping a = " + a + ","+" b = " +b );


    }


}
