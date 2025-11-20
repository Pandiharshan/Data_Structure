import java.util.*;

class Solution {
    static int solve(int bt[]) {
        int wait = 0;
        int n = bt.length;
        int total_time = 0;

        Arrays.sort(bt);

        for (int i = 0; i < n; i++) {
            total_time += wait;
            wait += bt[i];
        }
        return total_time / n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] bt = new int[n];

        for (int i = 0; i < n; i++) {
            bt[i] = sc.nextInt();
        }

        System.out.println(solve(bt));

        sc.close();
    }
}
