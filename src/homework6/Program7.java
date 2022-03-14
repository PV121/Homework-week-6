package homework6;

//7. Write a program to insert any temperature value in degree Fahrenheit
// and  convert to degree Celsius ((F − 32) × 5/9 = 0°C).

import java.util.Scanner;

public class Program7 {

    //main method
    public static void main(String[] args) {
        Program7 A = new Program7();
        A.temp();
    }

    // instance method
    public void temp() {
        //scanner
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the value of 'F' Fahrenheit temp = ");
        double F = Input.nextDouble();

        //Fahrenheit to Celcius : ((F-32)*5/9= 0 C)
        double Celcius = ((F - 32) * 5 / 9);
        System.out.println("Celcius = " + Celcius);

    }
}