import java.util.*;

class Solution {
    public int findMin(int n) {
        int cost = 10;
        int coin = 0;
        while (n > 0 && cost >= 1) {
            if (cost <= n) {
                n = n - cost;
                coin++;
            } else {
                cost = cost / 2;
            }
        }
        return coin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Solution obj = new Solution();
        System.out.println(obj.findMin(n));

        sc.close();
    }
}
