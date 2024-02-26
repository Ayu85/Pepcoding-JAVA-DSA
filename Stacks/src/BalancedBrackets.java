import java.util.Stack;

public class BalancedBrackets {
    static boolean isBalanced(String str) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stk.push(str.charAt(i));
            }
            else if (str.charAt(i) == ')') {
                if (stk.isEmpty()) return false; //means extra bracket is there
                else if (stk.peek() != '(') return false; //means mismatch of brackets
                else stk.pop(); //otherwise pop
            }
            else if (str.charAt(i) == '}') {
                if (stk.isEmpty()) return false;
                else if (stk.peek() != '{') return false;
                else stk.pop();
            }
            else if (str.charAt(i) == ']') {
                if (stk.isEmpty()) return false;
                else if (stk.peek() != '[') return false;
                else stk.pop();
            }

        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("[()]{}{[()()]()}"));
    }

}
