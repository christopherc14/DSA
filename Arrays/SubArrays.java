// import java.util.*;
// public class SubArrays {

//     public static void subarray(int num[]){
//         for(int i=0; i<num.length; i++)
//         {
//             int start= i;
//             for(int j=i; j<num.length;j++)
//             {
//                 int end= j;

//                 for(int k=start; k<=end; k++)
//                 {
//                     System.out.print(num[k]+" ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }

//     }
// public static void main(String [] args)
// {
//     Scanner sc= new Scanner(System.in);
//     int num[] = new int [5];
//     System.out.println("Enter the Elements in the Array:");
//     for(int i=0; i<num.length; i++)
//     {
//         num[i]=sc.nextInt();
//     }
//     subarray(num);

// }    
// }

import java.util.*;

public class SubArrays{

    public static void subArray(int num[])
    {
        for(int i=0; i<num.length;i++)
        {
            int start = i;

            for(int j=i; j<num.length; j++)
            {
                int end=j;

                for(int k=start; k<=end; k++)
                {
                    System.out.print(num[k] + " ");
                }
                System.out.println();
            }

            System.out.println();
        }
    }

    public static void main(String [] args)
    {
        int num[] = {45,63,87,96,48};

        subArray(num);
    }
}