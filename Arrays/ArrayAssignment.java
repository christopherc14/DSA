// // public class ArrayAssignment {
// //     public static Boolean distnict1(int num[])
// //     {
// //         Boolean flag= true;

// //         for(int i=0; i<num.length; i++)
// //         {
            
// //             for(int j=i+1; j<num.length; j++)
// //             {
// //                 if(num[i]==num[j])
// //                 {
// //                     return true;
// //                 }

// //             }
// //         }
// //         return false;
// //     }
// //     public static void main(String [] args)
// //     {
// //         int num[] = {1,2,3,1};
// //         System.out.println(distnict1(num));
// //     }
// // }


// // Using Binary Search Algorithm
// public class ArrayAssignment{
//     public static int RotatedSortedArray(int num[] , int target)
//     {
//         int left =0;
//         int right = num.length -1;

//         while(left <= right)
//         {
//             int mid = left + (right - left)/2;

//             if(num[mid]==target)
//             {
//                 return mid;
//             }

//             //checking which part of array is sorted 
//             if(num[left] <= num[mid])
//             {
//                 if(num[left] <= target && target <= num[mid])
//                 {
//                     right = mid-1;
//                 }
//                 else
//                 {
//                     left = mid+1;
//                 }
//             }
//             else 
//             {
//                 if(num[mid] < target && target <num [right])
//                 {
//                     left = mid+1;
//                 }
//                 else{
//                     right = mid-1;
//                 }
//             }
//         }
//         return -1;
//     }
//     public static void main(String [] args)
//     {
//         int num [] = {4,5,6,7,0,1,2};
//         int target = 0;
//         int result = RotatedSortedArray(num, target);
//         System.out.println("Target Found at index :" + result);
//     }
// }

public class ArrayAssignment{
    public static int Stockbut(int prices[])
    {
        int buyPrice = prices[0];
        int profit =0;

        for(int i=1; i<prices.length; i++)
        {
            if(buyPrice<prices[i])
            {
                profit = Math.max(prices[i] - buyPrice, profit);
            }
            else{
                buyPrice= prices[i];
            }
        }
        return profit;
    }
    public static void main(String [] args)
    {
        int prices [] = {7,1,5,3,6,4};
        System.out.println("The maximum profit is "+ Stockbut(prices));
    }
}