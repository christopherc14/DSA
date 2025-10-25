package SlidingWindow;
import java.util.HashSet;
import java.util.Set;


public class longestsubstring{

    public static int LongestSubString(String s)
    {
        int n= s.length();
        //Edge Case 
        if(n==0)
        {
            return 0; // Return if the length of String is Zero
        }

        int left=0;
        int max = 0;

        //Use a HashSet to store unique elements 
        Set<Character> window = new HashSet<>();

        for(int right=0; right<n; right++)
        {
            while(window.contains(s.charAt(right))) //If window has the element present , then we need to remove left (start) element to move the window
            {
                window.remove(s.charAt(left)); // Remove the left pointing element , 
                left++; //Increase the left++ i.e move the window 
            }

            window.add(s.charAt(right)); // If element is not present add it to the window!
            max = Math.max(max, right - left +1); //Find the size of the substring;
        }

        return max;
    }
    public static void main(String [] args)
    {
        String s= "abcabcbb";
        System.out.println("Longest Sub String length : " + LongestSubString(s));

    }
}