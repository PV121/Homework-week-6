package homework6;

//14. Write a Java program to print the area and perimeter of a rectangle. Test Data:
//Width = 5.5 Height = 8.5
// Expected Output:
//Area is 5.6 * 8.5 = 47.60
//Perimeter is 2 * (5.6 + 8.5) = 28.20

import java.util.Scanner;

public class Program14 {

    //main method
    public static void main(String[] args) {
        //scanner code
        Scanner rect = new Scanner(System.in);
        System.out.println("Enter Width(W) of ractangle:");
        double Width = rect.nextDouble();

        System.out.println("Enter Height(H) of ractangle:");
        double Height = rect.nextDouble();

        //Area of Ractangle= width * height
        double sum= Width * Height;
        System.out.println("Area of Ractangle = " +sum);

        //Perimeter of Ractangle= 2 * (Width + Height)
        double sum1= 2 * (Width + Height);
        System.out.println("Perimeter of Ractangle = "+sum1 );
    }
}
