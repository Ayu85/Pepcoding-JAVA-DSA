import java.util.*;

public class nextGreaterOnRight {
    static int[] getNextGreaters(int[] arr) {
        int[] temp = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        int k = temp.length - 2;
        stk.push(arr[arr.length - 1]);
        temp[temp.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (stk.peek() > arr[i]) {
                temp[k--] = stk.peek();
            } else if (stk.isEmpty()) {
                temp[k--] = -1;
            } else {
                while (!stk.isEmpty() && stk.peek() < arr[i])
                    stk.pop();
                temp[k--] = stk.isEmpty() ? -1 : stk.peek();
            }
            stk.push(arr[i]);
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNextGreaters(new int[]{13 , 7, 6 , 12})));
    }
}
