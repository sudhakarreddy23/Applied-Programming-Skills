class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Integer[] idx = new Integer[n];
        
        // Initialize index array
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }
        
        // Sort indices by corresponding heights in descending order
        Arrays.sort(idx, (a, b) -> heights[b] - heights[a]);
        
        // Build result
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = names[idx[i]];
        }
        
        return result;
    }
}
