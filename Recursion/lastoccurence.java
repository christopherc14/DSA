package Recursion;

public class lastoccurence{

    public static int lastOccurence(int arr [], int key , int i ){

        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }

    public static void main(String [] args)
    {
        int arr[] = {1,2,3,5,6,4,2,3};
        int key = 3;
        System.out.println(lastOccurence(arr, key, 0));
    }
    
}