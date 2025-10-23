// // // //Linear Search
// // // import java.util.*;
// // // public class LinearSearch {
// // //     public static int linearSearch(int numbers[], int key)
// // //     {
// // //         for(int i=0;i<numbers.length; i++)
// // //         {
// // //             if(numbers[i]==key)
// // //             {
// // //                 return i;
// // //             }
// // //         }
// // //         return -1;
// // //     }
// // //     public static void main(String args[])
// // //     {
// // //         Scanner sc= new Scanner(System.in);
// // //         int numbers[]= {3,4,6,2,1,4,5,90};
// // //         int key=1;

// // //         int index= linearSearch(numbers, key);
// // //         if(index==-1)
// // //         {
// // //             System.out.println("Element not found in Array");
// // //         }
// // //         else
// // //         {
// // //             System.out.println("Element found at index "+index);
// // //         }
// // //     }    
// // // }

// // //Linear Search
// // import java.util.*;
// // public class LinearSearch {
// //     public static int linearSearch(int numbers[], int key)
// //     {
// //         for(int i=0;i<numbers.length; i++)
// //         {
// //             if(numbers[i]==key)
// //             {
// //                 return i;
// //             }
// //         }
// //         return -1;
// //     }
// //     public static void main(String args[])
// //     {
// //         Scanner sc= new Scanner(System.in);
// //         int numbers[]=new int[6];
// //         System.out.println("Enter the elements in the array");
// //         for(int i=0; i<numbers.length; i++)
// //         {
// //             numbers[i]=sc.nextInt();
// //         } 
// //         System.out.println("Enter the Element to be Searched");
// //         int key=sc.nextInt();

// //         int index= linearSearch(numbers, key);
// //         if(index==-1)
// //         {
// //             System.out.println("Element not found in Array");
// //         }
// //         else
// //         {
// //             System.out.println("Element found at index "+index);
// //         }
// //     }    
// // }

// import java.util.*;
// public class LinearSearch{
//     public static int linearSearch(int numbers[], int key)
//     {
//         for(int i=0; i<numbers.length; i++)
//         {
//             if(numbers[i]==key)
//             {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String [] args)
//     {
//         Scanner sc= new Scanner (System.in);
//         int numbers[]= new int [6];
//         System.out.println("Enter the Elements in the Array: ");

//         for(int i=0; i<numbers.length; i++)
//         {
//             numbers[i]=sc.nextInt();
//         }

//         int key= sc.nextInt();

//         int index= linearSearch(numbers, key);
//         {
//             if(index==-1)
//             {
//                 System.out.println("Element not Found in the Array");
//             }
//             else{
//                 System.out.println("Element found at the Index : " +index);
//             }
//         }
//     }
// }

 import java.util.*;

 public class LinearSearch{
    public static int linearSearch(int numbers[], int key)
    {
        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]==key)
            {
                return i;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {45,89,63,74,23};
        int key = 74;

        int index= linearSearch(numbers, key);
        if(index==-1)
        {
            System.out.println("Element Not found");
        }
        else{
            System.out.println("Element found at Index : " + index);
        }
        
    }
 }