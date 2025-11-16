package Sorting;

public class selectionsort {
    
    public static void SelectionSort(int nums[], int n)
    {
        //Iterate to first element
        for(int i=0; i<n-1; i++)
        {
            int mini = i;

            for(int j=i+1; j<n; j++)
            {
                if(nums[j] < nums[mini])
                {
                    mini= j;
                }
            }

            int temp = nums[mini];
            nums[mini] = nums[i];
            nums[i] = temp;
        }

        System.out.println("After Selection Sort: " );
        for(int i=0; i<n; i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int nums[] = {7, 5, 9, 2, 8};
        int n = nums.length;
        System.out.println("Before Selection Sort");
        for(int i=0; i<n; i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        SelectionSort(nums, n);
    }
}
