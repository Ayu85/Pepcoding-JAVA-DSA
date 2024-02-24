package Arrays;

public class spanOfArray {
    static int getMax(int[] arr, int len) {
        int max = arr[0];
        for (int i = 1; i < len; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    static int getMin(int[] arr, int len) {
        int min = arr[0];
        for (int i = 1; i < len; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    static int getSpan(int[] arr, int length) {
        int max = getMax(arr, length);
        int min = getMin(arr, length);
        return max - min;
    }

    public static void main(String[] args) {
        System.out.println(getSpan((new int[] { 2, 1, 44, 5 }), 4));
    }
}
