public class rotateNum {
    static int rotate(int num, int k) {
        int result = 0;
        int pow=k;

        while (k>0) {
            int rem = num % 10;
            result += rem * Math.pow(10, pow-1);
            num /= 10;
            pow++;
            k--;
            System.out.println(k);

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(rotate(23457, 3));
    }
}
