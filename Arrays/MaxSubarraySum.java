// // // // // import java.util.*;
// // // // // public class MaxSubarraySum{
// // // // // public static void printSubarrays(int num[])
// // // // // {
// // // // //     int currSum=0;
// // // // //     int maxSum= Integer.MIN_VALUE;

// // // // //     for(int i=0; i<num.length; i++)
// // // // //     {
// // // // //         int start=i;

// // // // //         for(int j=1; j<num.length;j++)
// // // // //         {
// // // // //             int end=j;
// // // // //             currSum=0;

// // // // //             for(int k=start; k<=end; k++)
// // // // //             {
// // // // //                 currSum+=num[k];
// // // // //             }
// // // // //             System.out.print(currSum+" ");
// // // // //             if(maxSum<currSum)
// // // // //             {
// // // // //                 maxSum=currSum;
// // // // //             }
// // // // //         }
// // // // //     }
// // // // //     System.out.println("Max Sum :" + maxSum);
// // // // // }

// // // // // public static void main(String[] args)
// // // // // {
// // // // //     Scanner sc= new Scanner (System.in);
// // // // //     int num[]= new int[5];
// // // // //     System.out.println("Enter the elements in the array: ");

// // // // //     for(int i=0; i<num.length;i++)
// // // // //     {
// // // // //         num[i]=sc.nextInt();
// // // // //     }
// // // // //     printSubarrays(num);
// // // // // }
// // // // // }

// // // // // // Pre fix Sum 


// // // // import java.util.*;
// // // // public class MaxSubarraySum{

// // // //     public static void printSubarrays(int num[])
// // // //     {
// // // //         int currSum=0;
// // // //         int maxSum=Integer.MIN_VALUE;

// // // //         int prefix[]= new int[num.length];
// // // //         prefix[0]=num[0];

// // // //         for(int i=1; i<prefix.length;)
// // // //         {
// // // //             prefix[i] = prefix[i-1] + num[i];
// // // //         }
// // // //         for(int i=0; i<num.length; i++)
// // // //         {
// // // //             int start=i;

// // // //             for(int j=1; j<num.length; j++)
// // // //             {
// // // //                 int end= j;
// // // //                 currSum= start== 0 ? prefix[end] : prefix[end]-prefix[start-1];

// // // //                 if(maxSum<currSum)
// // // //                 {
// // // //                     maxSum=currSum;
// // // //                 }
// // // //             }
// // // //         }
// // // //         System.out.println("Max Sum = " + maxSum);
// // // //     }
// // // // public static void main(String[] args)
// // // // {
// // // //     Scanner sc = new Scanner (System.in);
// // // //     int num[] = new int[6];
// // // //     System.out.println("Enter the Elements in the Array: ");

// // // //     for(int i=0; i<num.length; i++)
// // // // {
// // // //     num[i] = sc.nextInt();
// // // // }
// // // //     printSubarrays(num);
// // // // }
// // // // }

// // // import java.util.*;
// // // public class MaxSubarraySum{

// // //     public static void printSubarray(int num[])
// // //     {
// // //         int currSum=0; // initialize the current sum to Zero 
// // //         int maxSum = Integer.MIN_VALUE; // initialize max sum to negative infinity

// // //         int prefix[] = new int [num.length]; // prefix array to store the sum of subarray ending at each index
// // //         prefix[0] = num[0]; 

// // //         for(int i=1; i<prefix.length; i++)
// // //         {
// // //             prefix[i]= prefix[i-1]+ num[i]; // prefix array is filled with the sum of subarray ending at each index
// // //         }

// // //         for(int i=0; i<num.length; i++)
// // //         {
// // //             int start=i;
// // //             for(int j=i; j<num.length; j++)
// // //             {
// // //                 int end= j;

// // //                 currSum= start==0 ? prefix[end] : prefix[end]- prefix[start-1];

// // //                 if(maxSum<currSum)
// // //                 {
// // //                     maxSum=currSum;
// // //                 }
// // //             }
// // //         }
// // //         System.out.println("Max Value is :  "+ maxSum);
// // //     }
// // //     public static void main(String [] args ){
// // //         Scanner sc = new Scanner(System.in);
// // //         int num[] = new int[6];
// // //         System.out.println("Enter the elements in the array :");
// // //         for(int i=0; i<num.length; i++)
// // //         {
// // //             num[i]=sc.nextInt();
// // //         }
// // //         printSubarray(num);

// // //     }
// // // }


// // // Max Subarray Sum using Brute force Algorithm
// // import java.util.*;
// // public class MaxSubarraySum{

// //     public static void printSubarray(int num[]){
// //         int currSum=0;
// //         int maxSum= Integer.MIN_VALUE;

// //         for(int i=0; i<num.length; i++)
// //         {
// //             int start=i;
// //             for(int j=i; j<num.length;j++)
// //             {
// //                 int end=j;
// //                 currSum=0;

// //                 for(int k=start; k<=end; k++)
// //                 {
// //                     currSum+= num[k];
// //                 }
// //                 System.out.println("The Current Sum is : "+currSum);

// //                 if(maxSum<currSum)
// //                 {
// //                     maxSum=currSum;
// //                 }
// //             }
// //         }
// //         System.out.println("The Maximum Subarray Sum is : "+ maxSum);
// //     }
// //     public static void main(String [] args)
// //     {
// //         Scanner sc = new Scanner (System.in);
// //         int num[] = {1,3,-2,4,6};
// //         printSubarray(num);

// //     }
// // }

// // Max Subarray sum using prefix sum array
// import java.util.*;
// public class MaxSubarraySum{
// public static void subarraySum(int num[]){
//     int currSum=0;
//     int maxSum= Integer.MIN_VALUE;

//     int prefix[]= new int[num.length];
//     prefix[0]=num[0];
//     for(int i=1;i<prefix.length; i++)
//     {
//         prefix[i]= prefix[i+1]+ num[i];
//     }

//     for(int i=0;i < num.length; i++)
//     {
//         int start=i;
//         for(int j=i; j<num.length; j++)
//         {
//             int end=j;
            
//             currSum= start==0 ? prefix[end] : prefix[end]- prefix[start-1];

//             if(maxSum<currSum){
//                 maxSum=currSum;
//             }
//         }
//     }
//     System.out.println("The Maximum Subarray Sum is : "+ maxSum);
// }

// public static void main(String [] args)
// {
//     int num[] = {1,6,-3,5,6,-8};
//     subarraySum(num);
// }
// }

// MaxSubarray Sum using kadanes algorithm
import java.util.*;
public class MaxSubarraySum{

    public static void kadanes(int num[])
    {
        int currSum=0;
        int maxSum= Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++)
        {
            currSum+= num[i];

            if(currSum<0)
            {
                currSum=0;
            }
            maxSum= Math.max(currSum, maxSum);
        }
        System.out.println("The Maximum Subbary Sum is : "+ maxSum);
    }
    public static void main(String [] args)
    {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);
    }
}