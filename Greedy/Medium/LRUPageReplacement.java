import java.util.*;

// User function Template for Java
class Solution {

    static class Node {
        int key;
        Node prev, next;

        Node(int k) { key = k; }
    }

    static Node head = new Node(-1);
    static Node tail = new Node(-1);

    public void addNode(Node newNode) {
        newNode.next = head.next;
        newNode.prev = head;
        head.next.prev = newNode;
        head.next = newNode;
    }

    public void deleteNode(Node delNode) {
        delNode.prev.next = delNode.next;
        delNode.next.prev = delNode.prev;
    }

    static int pageFaults(int N, int C, int pages[]) {

        head.next = tail;
        tail.prev = head;

        HashMap<Integer, Node> map = new HashMap<>();
        int faults = 0;

        Solution obj = new Solution();

        for (int i = 0; i < N; i++) {
            int key = pages[i];

            if (map.containsKey(key)) {
                Node node = map.get(key);
                obj.deleteNode(node);
                obj.addNode(node);
            } 
            else {
                faults++;

                if (map.size() == C) {
                    Node lru = tail.prev;
                    map.remove(lru.key);
                    obj.deleteNode(lru);
                }

                Node newNode = new Node(key);
                obj.addNode(newNode);
                map.put(key, newNode);
            }
        }

        return faults;
    }

    // ✅ Attached main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // number of pages
        int C = sc.nextInt();   // cache capacity
        int[] pages = new int[N];

        for (int i = 0; i < N; i++) {
            pages[i] = sc.nextInt();
        }

        System.out.println(pageFaults(N, C, pages));

        sc.close();
    }
}
