package SlidingWindow;

public class minsubArray {
    
    public static int minSubArrayLen(int target, int nums[])
    {
        int n=nums.length; 
        int left=0;
        int currentSum=0; //Initialize the current Sum to 0;
        int minLength = Integer.MAX_VALUE; // Make min length to infinity

        //Loop through the elements from 0 to define the sliding window
        for(int right=0; right<n; right++)
        {
            currentSum += nums[right]; // Add the element to the current Sum 

            while(currentSum >=target) //if current Sum is greater than target we will update the minLength and shrink the window from left;
            {
                minLength = Math.min(minLength, right - left +1);

                currentSum -= nums[left]; // Remove the first element from the window 
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String args[])
    {
        int target =7;
        int nums[]= {2,3,1,2,4,3};

        int result = minSubArrayLen(target, nums);
        System.out.println("Minimum Length : " + result);
        
    }
}
