import java.util.*;

public class stockSpan {
    static int[] getStockSpan(int[] arr, int n) {
        Stack<Integer> stk = new Stack<>();
        int[] temp = new int[n];
        stk.push(0);
        temp[0] = 1;
        for (int i = 1; i < n; i++) {
            if (!stk.isEmpty() && arr[stk.peek()] < arr[i]) {
                while (!stk.isEmpty() && arr[stk.peek()] < arr[i]) {
                    stk.pop();
                }
                temp[i] = stk.isEmpty() ? i+1 : i - stk.peek();
            }
            else {
                temp[i] = 1;
            }
            stk.push(i);
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getStockSpan(new int[]{20 ,12 ,1 ,28, 16, 20 }, 6)));
    }
}
