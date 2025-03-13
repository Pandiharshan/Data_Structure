import java.util.*;

class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int max = 0;
        int currentEnd = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i + nums[i] > max) max = i + nums[i];
            if (i == currentEnd) {
                jump++;
                currentEnd = max;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        System.out.println(obj.jump(nums));

        sc.close();
    }
}
