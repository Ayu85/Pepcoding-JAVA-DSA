import java.util.*;

public class stockSpan {
    static int[] getStockSpan(int[] arr, int n) {
        Stack<Integer> stk = new Stack<>();
        int[] temp = new int[n];
        stk.push(0);
        temp[0] = 1;
        for (int i = 1; i < n; i++) {
            if (arr[stk.peek()] < arr[i]) {
                while (arr[stk.peek()] < arr[i]) {
                    stk.pop();
                    temp[i] = i - stk.peek();
                }
            } else {
                temp[i] = 1;
            }
            stk.push(i);
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getStockSpan(new int[]{100, 80, 60, 70, 60, 75, 85}, 7)));
    }
}
