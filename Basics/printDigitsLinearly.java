public class printDigitsLinearly {
    static int getDigCount(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;

    }

    public static void main(String[] args) {
        int n = 7584;
        int divisor=getDigCount(n)-1;
        while(n>0){
            int quotient=(int)(n/(Math.pow(10, divisor)));
            System.out.println(quotient);
            n=(int)(n%(Math.pow(10, divisor--)));
        }
    }
}
