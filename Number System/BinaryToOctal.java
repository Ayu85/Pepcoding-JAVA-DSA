public class BinaryToOctal {
    static int convToDecimal(int number, int base) {
        int result = 0;
        int pow = 0;
        while (number > 0) {
            int rem = number % 10;
            result += rem * Math.pow(base, pow++);
            number /= 10;
        }
        return result;
    }

    static int getOctal(int binary, int base) {
        int octal = 0;
        int pow = 0;
        int decimal = convToDecimal(binary, 2);
        while (decimal > 0) {
            int rem = decimal % base;
            octal += rem * Math.pow(10, pow++);
            decimal /= base;
        }
        return octal;
    }

    public static void main(String[] args){
        System.out.println(getOctal(1011,8));
    }
}
