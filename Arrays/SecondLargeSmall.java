public class SecondLargeSmall {
 
    public static void getElements(int nums[], int n)
    {
        //Edge case
        if(n==0 || n==1)
        {
            return;
        }

        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int se_small = Integer.MAX_VALUE;
        int se_large = Integer.MIN_VALUE;

        for(int i=0; i<n; i++)
        {
            small = Math.min(small, nums[i]);
            large = Math.max(large, nums[i]);
        }

        for(int i=0; i<n; i++)
        {
            if(nums[i] < se_small && nums[i] != small)
            {
                se_small = nums[i];
            }

            if(nums[i] > se_large && nums[i] != large)
            {
                se_large = nums[i];
            }
        }

        System.out.println("Second Smallest:" + se_small);
        System.out.println("Second Largest:" + se_large);
    }
    public static void main(String[] args) {
        int nums[] = {2,4,5,2,8,6,12,78};
        int n = nums.length;
        getElements(nums, n);
    }
}
