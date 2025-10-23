package DividenConquer;

public class mergesort {

    public static void printArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void mergeSort(int arr[], int start, int end)
    {
        //Base Case
        if(start>=end)
        {
            return;
        }

        //Working
        int mid= start+(end-start)/2;
        mergeSort(arr, start, mid); //Left part
        mergeSort(arr,mid+1, end);//Right Part
        merge(arr,start, mid, end);
    }

    public static void merge(int arr[], int start, int mid, int end){
    int temp[] = new int[end-start+1];
    int i = start; //Iterator for left part
    int j= mid+1; // Iterator for right part
    int k = 0; //Iterator for temp array

    while(i<=mid && j<=end){ 
        if(arr[i] < arr[j]){
            temp[k] = arr[i];
            i++; 
        }else{
            temp[k]= arr[j];
            j++; 
        }
        k++;
    }

    //left part
    while(i<=mid){
        temp[k++]= arr[i++];
    }

    //Right part
    while(j<=end)
    {
        temp[k++]= arr[j++];
    }

    //Copy temp to original array 
    for(k=0, i=start; k<temp.length; k++, i++)
    {
        arr[i]= temp[k];
    }

 }
    public static void main(String [] args){
        int arr[] = {8,7,5,7,9,3,2,5,7,5,3,1};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
