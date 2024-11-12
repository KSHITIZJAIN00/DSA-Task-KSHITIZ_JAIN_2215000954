package recursion;
import java.util.*;
class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> result = new LinkedList<>();
            generateParenthesisHelper(n, n, "", result);
            return result;
        }
    
        private void generateParenthesisHelper(int left, int right, String current, List<String> result) {
            if (left == 0 && right == 0) {
                result.add(current);
                return;
            }
            if (left > 0) {
                generateParenthesisHelper(left - 1, right, current + "(", result);
            }
            if (right > 0 && left < right) {
                generateParenthesisHelper(left, right - 1, current + ")", result);
            }
        }
}