package Arrays;

import java.util.Arrays;

public class sumOfTwoArrays {
    // static int[] getSum(int[] arr1, int[] arr2, int n1, int n2) {
    // }
    static int[] getSum2(int[] arr1, int[] arr2, int n1, int n2) {
        int[] sum = new int[n1 > n2 ? n1 : n2];
        int i = n1 - 1;
        int j = n2 - 1;
        int k = sum.length - 1;
        while (i >= 0 && j >= 0) {
            sum[k--] = arr1[i--] + arr2[j--];
        }
        while (i >= 0) {
            sum[k--] = arr1[i--];
        }
        while (j >= 0) {
            sum[k--] = arr2[j--];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {7, 1, 2, 3, 4 };
        int[] b = { 9, 2, 3, 4 };
        System.out.println(Arrays.toString(getSum2(a, b, a.length, b.length)));
    }
}
