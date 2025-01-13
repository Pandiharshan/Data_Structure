import java.util.*;

class Solution {
    public boolean canJump(int[] nums) {
        int max_ind = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max_ind) return false;
            max_ind = Math.max(max_ind, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        System.out.println(obj.canJump(nums));

        sc.close();
    }
}
 