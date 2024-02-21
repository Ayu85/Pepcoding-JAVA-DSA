public class printFibonacciTillN {
    public static void main(String[] args) {
        int n = 10;
        int maxCount = n - 2;
        int start = 0;
        int end = 1;
        int i = 1;
        System.out.print(start + " ");
        System.out.print(end + " ");

        while (i <= maxCount) {
            int c = start + end;
            System.out.print(c + " ");
            start=end;
            end=c;
            i++;
        }
    }
}