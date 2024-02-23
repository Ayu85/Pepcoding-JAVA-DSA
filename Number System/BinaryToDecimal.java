public class BinaryToDecimal {
    static int convToDec(int num) {
        int binary = 0;
        int pow=0;
        while (num > 0) {
            int rem=num%10;
            binary+=rem*Math.pow(2, pow++);
            num/=10;
        }
        return binary;
    }
    public static void main(String[] args){
        System.out.println(convToDec(111001));
    }
}