public class Removeelement{

    public static int removeElement(int nums[], int val)
    {
        //Edge case
        int n= nums.length;
        if(n==0)
        {
            return 0;
        }

        int left=0;
        int right=n-1;

        while(left<=right)
        {
            if(nums[left] == val)
            {
                nums[left] = nums[right];
                right--;
            }
            else{
                left++;
            }
        }

        return left;
    }
    public static void main(String[] args)
    {
        int nums[] = {3,2,2,3};
        int val = 3;

        System.out.println("Array: " + removeElement(nums, val));
    }
}