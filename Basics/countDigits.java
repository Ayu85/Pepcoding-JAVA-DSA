public class countDigits {
    static int getDigits(int num){
        int digCount=0;
        while(num>0){
            digCount++;
            num/=10;
        }
        return digCount;
    }
    public static void main(String[] args){
        System.out.println(getDigits(25));
    }
}
