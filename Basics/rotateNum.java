public class rotateNum {
    static int rotate(int num, int k) {
        int result = 0;
        int pow = k+1;
        while (k > 0) {
            int rem = num % 10;
            result += rem * Math.pow(10, pow);
            num /= 10;
            pow++;
            k--;
        }
        return result+num;
    }

    public static void main(String[] args) {
        System.out.println(rotate(23457, 3));
    }
}
