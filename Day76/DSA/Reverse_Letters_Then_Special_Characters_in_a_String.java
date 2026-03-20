Question:- https://leetcode.com/problems/reverse-letters-then-special-characters-in-a-string/description/


Code:- 

class Solution {
    public String reverseByType(String s) {
        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        // Reverse alphabets
        while (i < j) {
            if (Character.isLetter(arr[i]) && Character.isLetter(arr[j])) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (!Character.isLetter(arr[i])) {
                i++;
            } else if (!Character.isLetter(arr[j])) {
                j--;
            }
        }

        i = 0;
        j = arr.length - 1;

        // Reverse non-alphabets
        while (i < j) {
            if (!Character.isLetter(arr[i]) && !Character.isLetter(arr[j])) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (Character.isLetter(arr[i])) {
                i++;
            } else if (Character.isLetter(arr[j])) {
                j--;
            }
        }

        return new String(arr);
    }
}