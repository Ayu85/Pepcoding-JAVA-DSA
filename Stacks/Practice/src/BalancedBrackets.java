import java.util.Stack;

public class BalancedBrackets {
    static boolean checkBalanced(String expr) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            } else if (ch == ')') {
                if (stk.peek() != '(') return false;
                else
                    stk.pop();
            } else if (ch == '}') {
                if (stk.peek() != '{') return false;
                else
                    stk.pop();
            } else if (ch == ']') {
                if (stk.peek() != '[') return false;
                else
                    stk.pop();
            }
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "[(a+b)+{(c+d)*(e/f)}";
        String s2="{[()]}";
        String s3="{[(])}";
        String s4="{{[[(())]]}}";
        System.out.println(checkBalanced(s4));
    }
}
