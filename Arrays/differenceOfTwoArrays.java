package Arrays;

import java.util.Arrays;

public class differenceOfTwoArrays {
    static int[] getDiff(int[] arr1, int[] arr2, int n1, int n2) {
        int[] diff = new int[n1 > n2 ? n1 : n2];
        int i = n1 - 1;
        int j = n2 - 1;
        int k = diff.length - 1;
        while (i >= 0 && j >= 0) {
            diff[k--] = arr1[i--] - arr2[j--];
        }
        while (i >= 0)
            diff[k--] = arr1[i--];

        while (j >= 0)
            diff[k--] = arr2[j--];

        return diff;
    }

    public static void main(String[] args) {
        int[] a = { 5, 4, 2, 3 };
        int[] b = { 1,3, 4, 2, 3 };
        System.out.println(Arrays.toString(getDiff(a, b, a.length, b.length)));
    }

}
