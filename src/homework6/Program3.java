package homework6;

//3. Write a Java programme using the following steps.
//3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//3.4 Call both instance and static variables i
//nto both instance and static methods inside the  print statement.
//3.5 Declare the Main method.
//3.6 Call both instance and static methods into the Main method and run the programme.

public class Program3 {

    //declaring instance variable
    int a=30;
    //declaring static variable
    static int b=50;

    //declaring instance method
    public void num(){
        System.out.println(a);
        System.out.println(b);


    }

    //declaring static method
    public static void num1(){
        //calling instace variable in static method
        Program3 obj=new Program3();
        System.out.println(obj.a);
        System.out.println(b);

    }

    //declaring main method
    public static void main(String[] args) {
        //calling static method in main method
        num1();
        //calling instance method in main method
        Program3 obj1=new Program3();
        obj1.num();


    }



}
