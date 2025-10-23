// import java.util.*;
// public class PairsArray {
//     public static void printPairs(int num[])
//     {
//         for(int i=0; i<num.length;i++)
//         {
//             int  curr= num[i];

//             for(int j=i+1; j<num.length;j++)
//             {
//                 System.out.print("("+curr + "," + num[j] + ")");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String [] args)
//     {
//         Scanner sc= new Scanner (System.in);
//         int num[]= new int[5];
//         System.out.println("Enter 5 numbers");

//         for(int i=0; i<num.length;i++)
//         {
//             num[i]=sc.nextInt();
//         }

//         printPairs(num);
//     }
// }


import java.util.*;

public class PairsArray{

    public static void pairsArray(int num[])
    {
        for(int i=0; i<num.length;i++)
        {
            int current = num[i];

            for(int j=i+1; j<num.length; j++)
            {
                System.out.println("(" + current + ", " + num[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String [] args)
    {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int num[] = new int[n];

        System.out.println("Enter the elements of the array :");
        for (int i=0; i<num.length; i++)
        {
            num[i]= sc.nextInt();
        }

        pairsArray(num);
    }
}