// // package DivideandConquer;

// // public class quicksort {

// //     public static void printArr(int arr[])
// //     {
// //         for (int i=0; i<arr.length;i++)
// //         {
// //             System.out.print(arr[i] + " ");
// //         }
// //         System.out.println();
// //     }

// //     public static void quickSort(int arr[], int start, int end)
// //     {
// //         //Base Case 
// //         if(start >=end)
// //         {
// //             return;
// //         }

// //         //last Element
// //         int pIdx = partition(arr, start, end);
// //         quickSort(arr, start, pIdx-1); // Left Side of the Pivot Number
// //         quickSort(arr, pIdx+1, end); //Right of the Pivot Number
// //     }

// //     public static int partition(int arr[] , int start, int end)
// //     {
// //         int pivot = arr[end];

// //         int i= start-1;

// //         for(int j=start; j<end; j++)
// //         {
// //             if(arr[j] <= pivot)
// //             {
// //                 i++;

// //                 //swap
// //                 int temp= arr[j];
// //                 arr[j]= arr[i];
// //                 arr[i]= temp;
// //             }
// //         }
// //         i++;
// //         int temp= pivot;
// //         arr[end]= arr[i];
// //         arr[i]= temp;
// //         return i;
// //     }
// //     public static void main(String []args)
// //     {
// //         int arr[] = {6,3,9,8,2,5};
// //         quickSort(arr, 0, arr.length-1);
// //         printArr(arr);
// //     }
    
// // 
// }
 

package DivideandConquer;

public class quicksort{

    public static void printArr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int start, int end)
    {

        //Base Case
        if(start >=end)
        {
            return;
        }
        //last Element
        int pIdx= partition(arr, start, end);
        quickSort(arr, start, pIdx-1);
        quickSort(arr, pIdx+1, end);
        
    } 

    public static int partition(int arr[] , int start, int end)
    {
        int pivot = arr[end];

        int i = start-1;

        for(int j=start; j<end; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;

                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;

        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String [] args)
    {
        int arr[] = {7,8,9,8,6,3,2,1,4};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}