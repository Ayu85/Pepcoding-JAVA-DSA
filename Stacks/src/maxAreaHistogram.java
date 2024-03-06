public class maxAreaHistogram {
    static int getMaxArea(int[] arr, int n) {
        int maxArea=-1;
        for (int i = 0; i < n; i++) {
            int ngl = getNGL(arr, arr[i]);
            int ngr = getNGR(arr, arr[i]);
            int area=(ngr-ngl)*arr[i];
            if(area>maxArea)
                maxArea=area;
        }
        return maxArea;
    }
}
