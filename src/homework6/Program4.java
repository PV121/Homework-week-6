package homework6;

//4. Write a Java programme using the following steps.
//4.1 Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme.

public class Program4 {
    //declaring two instance variables
    int a= 40;
    String Product= "Salt";
    //declaring two static variables
    static int d= 50;
    static String name = "Jaya";

    //decalring instance method
    public void apple(){
        //calling instance variavble to print
        System.out.println(a);
        System.out.println(Product);
        //calling static variables to print via object
        System.out.println(d);
        System.out.println(name);

    }

    //decalring static method
    public static void banana(){
        //calling instance variavble to print via object creation
        Program4 obj=new Program4();

        System.out.println(obj.a);
        System.out.println(obj.Product);

        //Printing static variables
        System.out.println(d);
        System.out.println(name);
    }

    //Decalring main method
    public static void main(String[] args) {
        //calling instance method in main method via object creation
        Program4 obj=new Program4();
        obj.apple();

        //calling static method in main method directly
        banana();


    }



}
