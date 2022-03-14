package homework6;

//8. Write a program to calculate the area of a triangle.

import java.util.Scanner;

public class Program8 {
    //main method
    public static void main(String[] args) {
        Program8 A = new Program8();
        A.triangle();
    }

    // instance method
    public void triangle() {
        //scanner
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the value of Base B = ");
        double B = Input.nextDouble();


        System.out.println("Enter the value of Hight H = ");
        double H = Input.nextDouble();

        //Area of Triangle is A= (B*H)/2
        double area = (B*H)/2;
        System.out.println("Area of Triangle = " + area);

    }
}
