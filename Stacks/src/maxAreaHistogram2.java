import java.util.*;

public class maxAreaHistogram2 {
    static int[] getNSR(int[] arr, int n) {
        int[] res = new int[n];
        Stack<Integer> stk = new Stack<>();
        res[n - 1] = 7;
        for (int i = n - 2; i >= 0; i--) {
            if (!stk.isEmpty() && arr[stk.peek()] < arr[i])
                res[i] = stk.peek();
            else if (stk.isEmpty())
                res[i] = 7;
            else {
                while (!stk.isEmpty() && arr[stk.peek()] > arr[i])
                    stk.pop();
                res[i] = stk.isEmpty() ? 7 : stk.peek();
            }
            stk.push(arr[i]);
        }
        return res;
    }

    static int[] getNSL(int[] arr, int n) {
        int[] res = new int[n];
        Stack<Integer> stk = new Stack<>();
        stk.push(0);
        res[n - 1] = -1;
        for (int i = 1; i < n; i++) {
            if (!stk.isEmpty() && arr[stk.peek()] < arr[i])
                res[i] = stk.peek();
            else if (stk.isEmpty())
                res[i] = -1;
            else {
                while (!stk.isEmpty() && arr[stk.peek()] > arr[i])
                    stk.pop();
                res[i] = stk.isEmpty() ? -1 : stk.peek();
            }
            stk.push(arr[i]);
        }
        return res;
    }

    static int[] getWidth(int[] right, int[] left) {
        int[] wid = new int[right.length];
        for (int i = 0; i < right.length; i++) {
            wid[i] = (right[i] - left[i]) - 1;
        }
        return wid;
    }

    static int getMaxAreaHist(int[] arr, int n) {
        int[] right = getNSR(arr, n);
        int[] left = getNSL(arr, n);
        int[] width = getWidth(right, left);
        int max = arr[0];
        for (int i = 1; i < width.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(getMaxAreaHist(new int[]{2,1,6,3}, 4));
    }
}
