import java.util.*;

class Solution {
    public int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platform = 1;
        int result = 1;
        int i = 1, j = 0;

        while (i < arr.length) {
            if (arr[i] <= dep[j]) {
                platform++;
                if (platform > result) {
                    result = platform;
                }
                i++;
            } else {
                platform--;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dep = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            dep[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        System.out.println(obj.minPlatform(arr, dep));

        sc.close();
    }
}
