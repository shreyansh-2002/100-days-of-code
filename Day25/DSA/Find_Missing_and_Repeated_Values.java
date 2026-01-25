class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int sum = 0;
        int orisum = 0;

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                mp.put(grid[i][j], mp.getOrDefault(grid[i][j], 0) + 1);
                sum += grid[i][j];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == 2) {
                list.add(entry.getKey());
            }
        }

        int n = grid.length * grid.length;

        orisum = (n * (n + 1)) / 2;

        list.add(orisum - sum + list.get(0));

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
