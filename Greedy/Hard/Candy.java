import java.util.*;

class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int lef[] = new int[n];
        int rig[] = new int[n];
        int sum = 0;

        lef[0] = rig[n - 1] = 1;

        for (int i = 0; i < n - 1; i++) {
            if (ratings[i + 1] > ratings[i]) lef[i + 1] = lef[i] + 1;
            else lef[i + 1] = 1;
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) rig[i] = rig[i + 1] + 1;
            else rig[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            if (lef[i] > rig[i]) sum += lef[i];
            else sum += rig[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ratings = new int[n];

        for (int i = 0; i < n; i++) {
            ratings[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        System.out.println(obj.candy(ratings));

        sc.close();
    }
}
