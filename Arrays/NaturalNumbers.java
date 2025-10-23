import java.util.*;
public class NaturalNumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter a Number to get the sum of its digits:");
        
        int num=sc.nextInt();

        int sum=0;

        int i=1;

        while(i<=num){
            sum+=i;

            i++;
        }

        System.out.println("The sum of the digits is "+sum);

    }
}
