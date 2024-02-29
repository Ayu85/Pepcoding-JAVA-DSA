import java.util.Stack;

public class DuplicateBrackets {
    static boolean checkString(String expr) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (ch == ')') {
                if (stk.peek() == '(')
                    return true;
                else {
                    while (stk.peek() != '(')
                        stk.pop();
                    if (stk.peek() == '(')
                        stk.pop();
                }
            } else
                stk.push(ch);
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "((a+b) +c)";
        System.out.println(checkString(s1));
    }
}
