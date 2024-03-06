public class maxAreaHistogram {
    static int getNSL(int[] arr, int index) {
        for (int i = index - 1; i >= 0; i--) {
            if (arr[i] < arr[index])
                return i;
        }
        return 0;
    }

    static int getNSR(int[] arr, int index) {
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] < arr[index])
                return i;
        }
        return 0;
    }

    static int getMaxArea(int[] arr, int n) {
        int maxArea = -1;
        for (int i = 0; i < n; i++) {
            int nsl = getNSL(arr, i);
            int nsr = getNSR(arr, i);
            int area = (nsr - nsl-1) * arr[i];
            if (area > maxArea)
                maxArea = area;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 5, 1, 6};
        System.out.println(getMaxArea(arr,arr.length));
    }
}
