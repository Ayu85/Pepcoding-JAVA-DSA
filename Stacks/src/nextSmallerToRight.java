import java.util.*;

public class nextSmallerToRight {
    static int[] getSmaller(int[] arr, int n) {
        Stack<Integer> stk = new Stack<>();
        int[] result = new int[n];
        stk.push(arr[n - 1]);
        result[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (!stk.isEmpty() && stk.peek() < arr[i])
                result[i] = stk.peek();
            else if (stk.isEmpty())
                result[i] = -1;
            else {
                while (!stk.isEmpty() && stk.peek() > arr[i])
                    stk.pop();
                result[i] = stk.isEmpty() ? -1 : stk.peek();
            }
            stk.push(arr[i]);
        }
        return result;
    }
}
