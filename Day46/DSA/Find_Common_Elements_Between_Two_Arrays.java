Question:- https://leetcode.com/problems/find-common-elements-between-two-arrays/description/

Code:-  

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i : nums1)
        {
            set1.add(i);
        }

        for(int i : nums2)
        {
            set2.add(i);
        }

        int answer1 = 0;
        int answer2 = 0;

        for(int i : nums1)
        {
            if(set2.contains(i))
            {
                answer1++;
            }
        }

        for(int i : nums2)
        {
            if(set1.contains(i))
            {
                answer2++;
            }
        }

        return new int[]{answer1,answer2};
    }
}