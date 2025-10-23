// //Finding Largest in Arrays
// import java.util.*;
// public class LargestArray {

//     public static int getLargest(int num[])
//     {
//         int largest=Integer.MIN_VALUE;
//         int smallest=Integer.MAX_VALUE;

//         for(int i=0; i<num.length; i++)
//         {
//             if(largest<num[i])
//             {
//                 largest=num[i];
//             }

//             if(smallest>num[i])
//             {
//                 smallest=num[i];
//             }
//         }
//         System.out.println("The Smallest Value is : "+smallest);
//         return largest;
    
        
//     }
//     public static void main(String [] args){
//         Scanner sc= new Scanner (System.in);

//         int num[] = new int[5];
//         System.out.println("Enter the Elements in the array: ");
//         for(int i=0; i<num.length; i++)
//         {
//             num[i]=sc.nextInt();
//         }

//         System.out.println("The Largest Element in the Array is : " + getLargest(num));
//     }
// }


import java.util.*;
 
public class LargestArray{
    public static int getLargest(int numbers[])
    {
        int largest = Integer.MIN_VALUE; // - Infinity 
        int smallest = Integer.MAX_VALUE; //+ Infinity

        for(int i=0; i<numbers.length; i++)
        {
            if(largest < numbers[i])
            {
                largest = numbers[i];
            }

            if(smallest > numbers[i])
            {
                smallest= numbers[i];
            }
        }
        System.out.println("The Smallest Value is : "+ smallest);

        return largest;
        
    }

    public static void main(String [] args)
    {
        int numbers[]= {45,86,23,56,96,87,99};

        int result = getLargest(numbers);

        System.out.println("The Largest Element is : " + result);

    }
}