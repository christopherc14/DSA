// This Question is Print The numbers by user input and break the printing when the user input number is divisible by 10 (Multiple of 10)
import java.util.*;
public class Break{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        do{
            System.out.println("Enter your Number:");
            int n=sc.nextInt();

            if(n % 10 == 0) // Checks whether the number is divisble by 10
            {
                System.out.println("This Num is divisible by 10");
                break;
            }
            System.out.println(n);
        } while(true);
    }
}