package Recursion;

import java.util.Scanner;

public class sorted{

    public static boolean isSorted(int arr[], int i)
    {

        if(i==arr.length-1){
            return true; // Base Case
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n= sc.nextInt();
        System.out.println("Enter the elements in the array:");
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++)
        {
            arr [i] = sc.nextInt();
        }

        System.out.println("is Array order sorted?" + "\n" + isSorted(arr, 0));
    
    }
}