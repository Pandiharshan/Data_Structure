import java.util.*;

class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0;
        int maxOpen = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                minOpen++;
                maxOpen++;
            }
            else if (c == ')') {
                minOpen--;
                maxOpen--;
            }
            else {
                minOpen--;
                maxOpen++;
            }
            if (maxOpen < 0) {
                return false;
            }
            if (minOpen < 0) minOpen = 0;
        }
        return minOpen == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Solution obj = new Solution();
        System.out.println(obj.checkValidString(s));

        sc.close();
    }
}
