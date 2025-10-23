// Create , Input , Output , Update Array
import java.util.*;
public class Arrays {
    public static void  main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Marks in Array:");
        int marks[]= new int[5];

        marks[0]=sc.nextInt();// Maths
        marks[1]= sc.nextInt();//Physics
        marks[2]=sc.nextInt();// Chemestry

        System.out.println("Maths Marks are: "+marks[0]);
        System.out.println("Physics Marks are: "+marks[1]);
        System.out.println("Chemistery Marks are: "+marks[2]);

            //Update the Array Value
        marks[2]=89;
        System.out.println("Updated Maths marks:"+ marks[2]);
    }
}
