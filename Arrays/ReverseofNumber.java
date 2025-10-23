// import java.util.*;
// public class ReverseofNumber {
//     public static void main(String args[]){
//          Scanner sc=new Scanner(System.in);
//          System.out.println("Enter a number to get its reverse:");

//          int num=sc.nextInt();

//          while(num>0)
//          {
//             int lastDigit= num%10;
//             System.out.print(lastDigit+" ");
//             num/=10;

//          }
//          System.out.println();
//     }
// }

import java.util.*;
public class ReverseofNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        int reverse =0;

        while(num>0){
        int lastDigit= num%10;

        reverse= (reverse*10)+lastDigit;
        num/=10;

        }
        System.out.println("Reverse of number is:"+reverse);
    }
}