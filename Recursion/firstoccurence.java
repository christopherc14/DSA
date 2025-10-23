package Recursion;

public class firstoccurence {
    
    public static int firstOcc(int arr [] , int key, int i){

    if(i==arr.length){ //Base case
        return -1;
    }
    
        if(arr[i]==key){
            return i;
        }

        return firstOcc(arr, key, i+1);
    }
    public static void main(String [] args)
    {   
        int key = 9;
        int arr[] = {1,5,3,7,9,3,9};
        System.out.println(firstOcc(arr, key, 0));

    }
}
