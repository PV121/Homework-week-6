package homework6;

//10. Write a Java program that takes a number as input and prints its  multiplication table up to 10.
//Test Data: Input a number: 8
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//... double area=math.PI
//8 x 10 = 80

import java.util.Scanner;

public class Program10 {

    public static void main(String[] args) {
        Scanner table=new Scanner(System.in);
        System.out.println("Enter the number for Table: ");
        int n=table.nextInt();

        for (int i=1;i<=10;i++) {
            int sum = i * n;
            System.out.println(n + "*" + i + "=" + sum);
        }

    }





}
