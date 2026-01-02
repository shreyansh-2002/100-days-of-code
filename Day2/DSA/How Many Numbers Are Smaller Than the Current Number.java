Question :- https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/?envType=problem-list-v2&envId=dsa-linear-shoal-array-ii

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        // ****** O(n^2) -- time complexity *********

        // int arr[] = new int[n];

        // for(int i = 0;i<nums.length;i++)
        // {
        //     int cnt = 0;
        //     for(int j = 0;j<nums.length;j++)
        //     {
        //         if(j != i && nums[j] < nums[i])
        //         {
        //             cnt++;
        //         }
        //     }
        //     arr[i] = cnt;
        // }

        // return arr;

        // ****** O(n logn) ********** -- time complexity
        int n = nums.length;

        int arr[] = nums.clone();
        Arrays.sort(arr);

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            map.putIfAbsent(arr[i], i);
        }

        int ans[] = new int[n];

        for(int i = 0;i<n;i++)
        {
            ans[i] = map.get(nums[i]);
        }

        return ans;

    }
}