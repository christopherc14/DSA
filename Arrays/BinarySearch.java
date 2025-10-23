// // Binary Search Algorithm
// import java.util.*;
// public class BinarySearch {
//     public static int binarySearch(int array[], int key)
//     {
//         int start=0;
//         int end= array.length -1;

        

//         while(start <= end)
//         {
//             int mid=(start+end)/2;
//             if(array[mid]==key)
//             {
//                 return mid;
//             }
//             else if(array[mid]<key)
//             {
//                 start=mid+1;
//             }
//             else
//             {
//                 end=mid-1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);

//         int array[]= new int[6];
//         System.out.println("Enter the Elements in the Array:");

//         for(int i=0; i<array.length; i++)
//         {
//             array[i]=sc.nextInt();
//         }
//         System.out.println("Enter the element to be searched: ");
//         int key =sc.nextInt();

//         System.out.print("The Element found at index :"+ binarySearch(array,key));
//     }
// }

import java.util.*;

public class BinarySearch{

    public static int binarySearch(int num[], int key)
    {
        int start=0; 
        int end= num.length-1;
        
        while(start<=end)
        {
            int mid= start + (end- start)/2;

            if(num[mid]==key)
            {
                return mid;
            }
            if(num[mid]<key)
            {
                start= mid+1;
            }
            else{
                end= mid-1;
            }
        }

        return -1;
    }
    public static void main(String [] args)
    {
        int num[] = {12,56,78,89,96,99};
        int key = 96;

        System.out.println("Index for the Key Element is :" + binarySearch(num, key));
    }
}