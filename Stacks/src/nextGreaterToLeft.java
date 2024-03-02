import java.util.*;

public class nextGreaterToLeft {
    static int[] getGreaterToLeft(int[] arr, int n) {
        Stack<Integer> stk = new Stack<>();
        int[] temp = new int[n];
        temp[0] = -1;
        stk.push(arr[0]);
        for (int i = 1; i < n; i++) {
            if (!stk.isEmpty() && stk.peek() > arr[i]) {
                temp[i] = stk.peek();
            } else if (stk.isEmpty())
                temp[i] = -1;
            else {
                while (!stk.isEmpty() && stk.peek() < arr[i])
                    stk.pop();
                temp[i] = stk.isEmpty() ? -1 : stk.peek();
            }
            stk.push(arr[i]);
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getGreaterToLeft(new int[]{1, 3, 2, 4,}, 4)));
    }
}
