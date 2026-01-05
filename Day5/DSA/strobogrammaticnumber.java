// Question:- 

// 246. Strobogrammatic Number

// A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).

// Write a function to determine if a number is strobogrammatic. The number is represented as a string.

// Example 1:

// Input:  "69"
// Output: true
// Example 2:

// Input:  "88"
// Output: true
// Example 3:

// Input:  "962"
// Output: false

// Solution:- 

import java.util.*;

public class strobogrammaticnumber {
    public static boolean isStrobogrammatic(String str) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();

        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');

        int left = 0;
        int right = str.length() - 1;

        while (left <= right) {
            char l = str.charAt(left);
            char r = str.charAt(right);

            if (!map.containsKey(l) || map.get(l) != r) {
                return false;
            }

            left++;
            right--;

        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your Number which you want to check whether it is strobogrammatic or not ");
        String str = sc.next();

        System.out.println(isStrobogrammatic(str));

    }
}
