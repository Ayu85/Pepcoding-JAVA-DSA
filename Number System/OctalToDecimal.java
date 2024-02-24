public class OctalToDecimal {
    static int getDecimal(int octal) {
        int dec = 0;
        int pow = 0;
        while (octal > 0) {
            int rem = octal % 10;
            dec += rem * Math.pow(8, pow++);
            octal/=10;
        }
        return dec;
    }
    public static void main(String[] args){
        System.out.println(getDecimal(1172));
    }
}
