import java.util.*;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);

        int n = g.length, m = s.length;
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (s[j] >= g[i]) i++;
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] g = {1, 2, 3};
        int[] s = {1, 1};

        int result = sol.findContentChildren(g, s);
        System.out.println(result);
    }
}
