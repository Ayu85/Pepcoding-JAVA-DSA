import java.util.Arrays;

public class stock_span {
    static int[] getSpan(int[] arr, int n) {
        int[] temp = new int[n];
        int k = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            int count = 0;
            int max = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > max) {
                    max = arr[j];
                    count++;
                    break;
                }
                count++;
            }
            if (max == arr[i])
                temp[k--] = i + 1;
            else
                temp[k--] = count;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {60, 70, 80, 100, 90, 75, 80, 120};
        System.out.println(Arrays.toString(getSpan(arr, arr.length)));
    }
}