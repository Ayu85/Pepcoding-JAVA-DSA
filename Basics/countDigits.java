public class countDigits {
    static int getDigits(int num) {
        int digCount = 0;
        while (num > 0) {
            int rem = num % 10;
            System.out.print(rem+" ");
            digCount++;
            num /= 10;
        }
        return digCount;
    }

    public static void main(String[] args) {
        System.out.println("digits count "+getDigits(25));
    }
}
