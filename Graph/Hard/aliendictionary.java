import java.util.*;

class Solution {
    // Stores the final character order
    StringBuilder result = new StringBuilder();

    // BFS function for Kahn's Algorithm (topological sort)
    public void bfs(ArrayList<ArrayList<Integer>> adj, int[] indegree) {
        Queue<Integer> q = new LinkedList<>();

        // Add all characters with indegree 0 (no prerequisites) to the queue
        for (int i = 0; i < 26; i++) {
            if (indegree[i] == 0) q.add(i);
        }

        // Process characters in BFS manner
        while (!q.isEmpty()) {
            int cur = q.poll();

            // Convert numeric index back to character and append to result
            result.append((char)(cur + 'a'));

            // Reduce indegree of all neighbors (characters that come after 'cur')
            for (int next : adj.get(cur)) {
                indegree[next]--;
                if (indegree[next] == 0) q.add(next); // ready to process
            }
        }
    }

    public String findOrder(String[] words) {
        // Initialize graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 26; i++) adj.add(new ArrayList<>());

        // Indegree array: -1 means character not used yet
        int[] indegree = new int[26];
        Arrays.fill(indegree, -1);

        // Mark characters that actually appear in the words
        for (String word : words) {
            for (char c : word.toCharArray()) {
                indegree[c - 'a'] = 0;
            }
        }

        // Build graph edges by comparing adjacent words
        for (int i = 0; i < words.length - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];
            int len = Math.min(s1.length(), s2.length());
            boolean validEdgeFound = false;

            for (int j = 0; j < len; j++) {
                int u = s1.charAt(j) - 'a';
                int v = s2.charAt(j) - 'a';

                if (u != v) {
                    // Add edge u -> v if it doesn't already exist
                    if (!adj.get(u).contains(v)) {
                        adj.get(u).add(v);
                        indegree[v]++;
                    }
                    validEdgeFound = true; // found first differing character
                    break; // only first mismatch matters
                }
            }

            // Invalid prefix case: longer word comes before its prefix
            if (!validEdgeFound && s1.length() > s2.length()) return "";
        }

        // Perform BFS-based topological sort
        bfs(adj, indegree);

        // Count number of used characters
        int usedCount = 0;
        for (int i = 0; i < 26; i++) if (indegree[i] >= 0) usedCount++;

        // Cycle detection: if not all characters were processed
        if (result.length() != usedCount) return "";

        return result.toString(); // return valid character order
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of words
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine().trim();
        }

        Solution sol = new Solution();
        String order = sol.findOrder(words);

        System.out.println(order);
        sc.close();
    }
}
✅ Example Input
Copy code
5
baa
abcd
abca
cab
cad
✅ Output
nginx
Copy code
bdac
(One valid order — multiple answers may exist)

🧠 Notes
This code is interview-ready

Handles:

Prefix invalid case

Duplicate edges

Cycle detection

Uses BFS (Kahn’s Algorithm) correctly

If you want:

GFG-style driver

LeetCode-style adaptation

DFS topo version

Step-by-step dry run

Just tell 👍







 