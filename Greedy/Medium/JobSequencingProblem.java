import java.util.*;

class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {

        int n = deadline.length;
        int[][] jobs = new int[n][2];
        int maxDeadline = 0;

        for (int i = 0; i < n; i++) {
            jobs[i][0] = deadline[i];
            jobs[i][1] = profit[i];
            maxDeadline = Math.max(maxDeadline, deadline[i]);
        }

        Arrays.sort(jobs, (a, b) -> b[1] - a[1]);

        int[] slots = new int[maxDeadline + 1];
        int jobCount = 0;
        int totalProfit = 0;

        for (int i = 0; i < n; i++) {
            int d = jobs[i][0];
            for (int j = d; j > 0; j--) {
                if (slots[j] == 0) {
                    slots[j] = 1;
                    jobCount++;
                    totalProfit += jobs[i][1];
                    break;
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(jobCount);
        ans.add(totalProfit);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] deadline = new int[n];
        int[] profit = new int[n];

        for (int i = 0; i < n; i++) {
            deadline[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            profit[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        ArrayList<Integer> res = solution.jobSequencing(deadline, profit);

        System.out.println(res.get(0) + " " + res.get(1));

        scanner.close();
    }
}
 