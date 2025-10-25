package DividenConquer;

public class mergesort{

    public static void mergeSort(int nums[], int start, int end)
    {
        //Base Case
        if(start >=end)
        {
            return;
        }

        //Calculate mid value
        int mid= start + (end - start) /2;
        //Left part
        mergeSort(nums, start, mid);
        mergeSort(nums, mid+1, end);
        merge(nums, start, mid, end);
    }

    public static void merge(int nums[], int start, int mid, int end)
    {
        int temp[] = new int[end - start +1];
        int i=start; //Iterator to left part
        int j= mid+1; //Iterator for right part
        int k=0; //Iterator for temp array;

        while(i<=mid && j<=end)
        {
            if(nums[i] <= nums[j])
            {
                temp[k] = nums[i];
                i++;
            }
            else
            {
                temp[k] = nums[j];
                j++;
            }
            k++;
        }

        //Left part
        while(i<=mid)
        {
            temp[k++] = nums[i++];
        }

        //Right part
        while(j<=end)
        {
            temp[k++] = nums[j++];
        }

        //copy temp  to original
        for(k=0, i=start; k<temp.length; k++, i++)
        {
            nums[i] = temp[k];
        }

    }

    public static void printarray(int nums[])
    {
        for(int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int nums[] = {6,3,9,5,2,8};
        mergeSort(nums, 0, nums.length-1);
        printarray(nums);
    }
}