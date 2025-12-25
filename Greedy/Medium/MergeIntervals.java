import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] last = ans.get(ans.size() - 1);

            if (last[1] >= intervals[i][0]) {
                last[1] = Math.max(last[1], intervals[i][1]);
            } else {
                ans.add(intervals[i]);
            }
        }

        int mergedIntervals[][] = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            mergedIntervals[i] = ans.get(i);
        }

        return mergedIntervals;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] intervals = new int[n][2];

        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        Solution obj = new Solution();
        int[][] res = obj.merge(intervals);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }

        sc.close();
    }
}
