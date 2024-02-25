import java.util.Stack;

public class DuplicateBrackets {
    static boolean checkDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ')')
                stk.push(s.charAt(i));
            else if (stk.peek() == '(')
                return true;
            else {
                while (stk.peek() != '(') {
                    stk.pop();
                }
                if (stk.peek() == '(')
                    stk.pop();
            }
        }
        return !stk.isEmpty();
    }

    public static void main(String[] args) {
        String exp = "((a+b)+(c+d))";
        String exp2 = "(a+b)+((c+d))";
        String exp3 = "((a+b)+((c+d)))";
        System.out.println(checkDuplicates(exp3));
    }
}
