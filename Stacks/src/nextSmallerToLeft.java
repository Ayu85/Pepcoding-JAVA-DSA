import java.util.*;

public class nextSmallerToLeft {
    static int[] getSmaller(int[] arr, int n) {
        Stack<Integer> stk = new Stack<>();
        int[] temp = new int[n];
        stk.push(arr[0]);
        temp[0] = -1;
        for (int i = 1; i < n; i++) {
            if (!stk.isEmpty() && stk.peek() < arr[i])
                temp[i] = stk.peek();
            else if (stk.isEmpty())
                temp[i] = -1;
            else {
                while (!stk.isEmpty() && stk.peek() > arr[i])
                    stk.pop();
                temp[i] = stk.isEmpty() ? -1 : stk.peek();
            }
            stk.push(arr[i]);
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSmaller(new int[]{1, 5, 0, 3, 4, 5}, 6 )));
    }
}
