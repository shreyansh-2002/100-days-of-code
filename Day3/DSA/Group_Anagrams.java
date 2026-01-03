Question :- https://leetcode.com/problems/group-anagrams/description/

Code:- 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        for (String i : strs) {
            char arr[] = i.toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);

            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
            }

            map.get(str).add(i);
        }

        return new ArrayList<>(map.values());
    }
}

