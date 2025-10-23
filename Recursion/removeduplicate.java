package Recursion;

public class removeduplicate {
    
    public static void removeDuplicate(String str, int idx, boolean[] map, StringBuilder newStr) {
        // Base case: reached end of string
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        int charIndex = currChar - 'a';
        
        // If character not encountered before
        if (!map[charIndex]) {
            map[charIndex] = true;  // Mark as seen
            newStr.append(currChar); // Add to result
        }
        
        // Process next character
        removeDuplicate(str, idx + 1, map, newStr);
    }

    public static void main(String[] args) {
        String str = "appnnacolllege";
        removeDuplicate(str, 0, new boolean[26], new StringBuilder());
    }
}
