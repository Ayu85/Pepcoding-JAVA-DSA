import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement {
    static Stack getGreaterElements(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int max = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    max = arr[j];
                    break;
                }
            }
            stk.push(max);
        }
        return stk;
    }

    static int[] getGreaterOptimal(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int[] temp = new int[arr.length];
        temp[temp.length - 1] = -1;
        stk.push(arr[arr.length - 1]);
        int k = temp.length - 2;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (!stk.isEmpty() && stk.peek() <= arr[i])
                stk.pop();
            if (stk.isEmpty())
                temp[k--] = -1;
            else
                temp[k--] = stk.peek();


            stk.push(arr[i]);
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getGreaterOptimal(new int[]{2, 5, 9, 3, 1, 12, 6, 8, 7})));
    }
}
