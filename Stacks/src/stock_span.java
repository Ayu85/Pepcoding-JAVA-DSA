import java.util.Arrays;

public class stock_span {
    static int[] getSpan(int[] arr, int n) {
        int[] temp = new int[n];
        int k = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            int count = 0;
            int max = arr[i];
            int flag = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > max) {
                    max = arr[j];
                    count++;
                    break;
                } else if (arr[j] == max) {
                    flag = 1;
                    count++;
                    break;
                }
                count++;
            }
            if (flag == 1)
                temp[k--] = count;
            else if (max == arr[i])
                temp[k--] = i + 1;
            else
                temp[k--] = count;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {60, 70, 80, 100, 90, 75, 80, 120};
        int[] arr2 = {5, 3, 8, 7, 10, 7, 7, 12, 16};

        System.out.println(Arrays.toString(getSpan(arr2, arr2.length)));
    }
}