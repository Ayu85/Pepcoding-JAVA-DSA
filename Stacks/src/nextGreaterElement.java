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

    public static void main(String[] args) {
        System.out.println(getGreaterElements(new int[]{2, 5, 9, 3, 1, 12,6, 8, 7,8}));
    }
}
