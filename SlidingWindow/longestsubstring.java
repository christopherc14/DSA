package SlidingWindow;
import java.util.HashSet;
import java.util.Set;

public class longestsubstring {
    
    public static int lengthOfLongestSubstring(String s)
    {
        int n= s.length();
        if(n==0)
        {
            return 0;
        }

        Set<Character> window = new HashSet<>();
        int max=Integer.MIN_VALUE;
        int left=0;

        for(int right=0; right<n; right++)
        {
            while(window.contains(s.charAt(right)))
            {
                window.remove(s.charAt(left));
                left++;
            }

            window.add(s.charAt(right));
            max = Math.max(max, right - left +1);
        }

        return max;
    }

    public static void main(String args[])
    {
        String s= "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println("maximum length : " + result);
    }
}
