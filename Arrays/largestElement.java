public class largestElement{

    public static int largest(int nums[])
    {
        int max= nums[0];
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int nums[] = {2,4,5,6,3,2,8,7};
        System.out.println("maximum Element is:" + largest(nums));
    }
}