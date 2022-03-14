package homework6;

//6. Write a program to enter any radius value of the circle
// and find out the  area.(Formula of Area A=PI*r*r).

import java.util.Scanner;

public class Program6 {

    //Main method
    public static void main(String[] args) {

        Program6 a= new Program6();
        a.insta();

    }

    // instance method
    public void insta(){
        //scanner
        Scanner Input= new Scanner(System.in);
        System.out.println("Enter the value of 'r' radius = ");
        double radius= Input.nextDouble();

        //Area of circle= 3.14 * r * r

        double area=(3.14 * radius * radius);
        System.out.println("Area of circle is: "+area);

    }

}
