package Arrays;

import java.util.Arrays;

public class sumOfTwoArrays {
    static int[] getSum(int[] arr1, int[] arr2, int n1, int n2) {
        int[] sum = new int[n1 > n2 ? n1 : n2];
        for (int i = 0; i < n1; i++) {
            sum[i] = arr1[i] + arr2[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(getSum(a, b, a.length, b.length)));
    }
}
