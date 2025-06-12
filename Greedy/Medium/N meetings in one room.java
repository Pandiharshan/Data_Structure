import java.util.*;

class Solution 
{
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) 
    {
        int n = start.length;
        int schedule[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            schedule[i][0] = start[i];
            schedule[i][1] = end[i];
        }

        Arrays.sort(schedule, (a, b) -> a[1] - b[1]);

        int total = 0;
        int last_end = -1;

        for (int i = 0; i < n; i++) {
            if (schedule[i][0] > last_end) {
                total++;
                last_end = schedule[i][1];
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            end[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        System.out.println(obj.maxMeetings(start, end));

        sc.close();
    }
}
 