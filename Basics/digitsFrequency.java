public class digitsFrequency {
    static int getFrequency(int num, int target) {
        int frq = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == target)
                frq++;
            num /= 10;
        }
        return frq;
    }

    public static void main(String[] args) {
        System.out.println(getFrequency(145141, 5));
    }
}
