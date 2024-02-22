public class inverseNum {
    static int inverse(int n) {
        int inv = 0;
        int counter = 0;
        while (n > 0) {
            int rem = n % 10;
            counter++;
            inv += counter * Math.pow(10, rem - 1);
            n /= 10;
        }
        return inv;
    }

    public static void main(String[] args) {
        System.out.println(inverse(21453));
    
    }
}
