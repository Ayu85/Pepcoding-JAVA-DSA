public class DecimalToOctal {
    static int getOctal(int decimal) {
        int octal = 0;
        int pow = 0;
        while (decimal > 0) {
            int rem = decimal % 8;
            octal += rem * Math.pow(10, pow++);
            decimal /= 8;
        }
        return octal;
    }

    public static void main(String[] args) {
        System.out.println(getOctal(634));
    }
}
