public class printAllPrimesTillN {
    static boolean isPrime(int n) {
        for (int i =2; i*i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int low= 5;
        int high=15;
        for (int i = low; i <= high; i++) {
            if(isPrime(i))
            System.out.print(i+" ");
        }
    }
}
