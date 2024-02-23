public class DecimalToBinary {
    static int getBinary(int decimal) {
        int binary = 0;
        int pow = 0;
        while (decimal > 0) {
            int rem = decimal % 2;
            binary += rem * Math.pow(10, pow++);
            decimal /= 2;
        }
        return binary;
    }
    public static void main(String[] args){
        System.out.println(getBinary(57));
    }
}
