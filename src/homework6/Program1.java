package homework6;

//1. Write a Java programme using the following steps.
//1.1 Declare two instance variables.
//1.2 Declare one instance method.
//1.3 Call both instance variables into the instance method inside the print statement. 1.4 Declare the Main method.
//1.5 Call the above instance method into the Main method and Run the programme.

public class Program1 {
    //Two instance variables
    int a=10;
    String B="Ram";


    //creating instance method
    public void test(){
        //calling instance variables into instance method to print
        System.out.println(a);
        System.out.println(B);

    }

    //creating main method
    public static void main(String[] args) {
        //calling instance method into main method via object creation

        Program1 obj=new Program1();
        obj.test();


    }

}
