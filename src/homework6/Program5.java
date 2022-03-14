package homework6;

//5. Write a program for a calculator with addition, subtraction, multiplication
// and division methods all with parameters and use string concatenation  methods.
// (Note: Two static and Two instance methods.)

public class Program5 {
    //declaring instance variables


    //instance Addition method
    public void addition(int a,int b){
        int sum= a + b;
        System.out.println("Addition of " +a +" and " +b+" = " +sum);

    }

    //instance subtraction method
    public void subtraction(int a,int b){
        int sum1= a - b;
        System.out.println("Subtraction of "  +a +" and " +b+" = " +sum1);


    }

    //static multiplication method
    public static void multiplication(int a,int b){
        //object creation to call instance variable


        int sum2= a * b;
        System.out.println("Multiplication of "  +a +" and " +b+" = " +sum2);


    }

    //division method
    public static void division(double a,double b){
        //object creation to call instance variable
        Program5 f=new Program5();
        double sum3= a / b;
        System.out.println("Division of "  +a +" and " +b+" = " +sum3);


    }


    //main method
    public static void main(String[] args) {
        //object creation to call instance the method in main method
        Program5 a=new Program5();
        a.addition(5,10);
        a.subtraction(3,6);

        //calling static method directly
        multiplication(10,20);
        division(7,20);


    }


}
