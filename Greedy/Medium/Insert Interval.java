import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) 
    {
        ArrayList<int[]> ans = new ArrayList<>();
        int i = 0;

        while (i < intervals.length && intervals[i][0] < newInterval[0]) 
        {
            ans.add(intervals[i]);
            i++;
        }

        if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < newInterval[0]) {
            ans.add(newInterval);
        } else {
            int[] last = ans.get(ans.size() - 1);
            last[1] = Math.max(last[1], newInterval[1]);
        }

        while (i < intervals.length) 
        {
            int[] last = ans.get(ans.size() - 1);

            if (intervals[i][0] <= last[1]) {
                last[1] = Math.max(last[1], intervals[i][1]);
            } 
            else {
                ans.add(intervals[i]);
            }
            i++;
        }

        return ans.toArray(new int[ans.size()][2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] intervals = new int[n][2];

        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        int[] newInterval = new int[2];
        newInterval[0] = sc.nextInt();
        newInterval[1] = sc.nextInt();

        Solution obj = new Solution();
        int[][] res = obj.insert(intervals, newInterval);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }

        sc.close();
    }
}
 