package homework6;

//2. Write a Java programme using the following steps.
//2.1 Declare two static variables
//2.2 Declare one static method
//2.3 Call both static variables into the static method inside the print statement. 2.4 Declare the Main method.
//2.5 Call the static method into the Main method and Run the programme

public class Program2 {
    // Declaring two static variables
    static int a=20;
    static String name= "Ramesh";


    //Declaring static method
    public static void test(){
        System.out.println(a);
        System.out.println(name);


    }


    //Declaring main method
    public static void main(String[] args) {
        //calling static method into main method directly
        test();

    }
}