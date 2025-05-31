class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Sort the greed factor and cookie sizes
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // Pointer for children
        int j = 0; // Pointer for cookies
        int k = 0; // Count of content children

        // Use two pointers to find the maximum number of content children
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) { // If the cookie can satisfy the child's greed
                k++; // Increase the count of content children
                i++; // Move to the next child
            }
            j++; // Move to the next cookie
        }
        return k; // Return the count of content children
    }
}
