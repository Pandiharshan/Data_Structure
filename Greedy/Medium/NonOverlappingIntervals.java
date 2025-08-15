import java.util.*;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Sort by end time to minimize overlap with subsequent intervals
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int count = 0;
        int lastEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < lastEnd)
                // Overlap detected, increment removal count
                count++;
            else
                lastEnd = intervals[i][1];
        }
        return count;
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
        System.out.println(obj.eraseOverlapIntervals(intervals));

        sc.close();
    }
}
