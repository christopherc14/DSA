// import java.util.*;
// public class ReverseArray {
//     public static void reverseArray(int num[]){
//         int start=0 , end= num.length-1;

//         while(start<end)
//         {
//             // swap
//             int temp= num[end];
//             num[end]= num[start];
//             num[start]= temp;

//             start++;
//             end--;
//         }
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc= new Scanner(System.in);
//         int num[]=new int[5];

//         System.out.println("Enter the Elements in the Array:");

//         for(int i=0; i<num.length; i++)
//         {
//             num[i]=sc.nextInt();
//         }

//         System.out.println("The Reversed Array is : ");
//         reverseArray(num);

//         for(int i=0; i<num.length; i++)
//         {
//             System.out.println(num[i]);
//         }
//         System.out.println();
//     }    
// }


import java.util.*;

public class ReverseArray{

    public static void reverseArray(int num[])
    {
        int start= 0 , end = num.length -1;

        while(start<end){

            //swap
            int temp = num[end];
            num[end]= num[start];
            num[start]= temp;

            start++;
            end--;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();
        int num[] =  new int[n];

        System.out.println("Enter the Elements in the Array : ");
        for(int i=0; i<num.length; i++)
        {
            num[i]= sc.nextInt();
        }

        //Display Elements of the Array 
        System.out.println("The Array Elements are : ");
        for(int i=0; i<num.length; i++)
        {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        reverseArray(num);

        System.out.println("Reversed Array Elements are : ");
        for(int i=0; i<num.length; i++)
        {
            System.out.print(num[i] + " ");
        }
       
    }
}