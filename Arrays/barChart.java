package Arrays;

public class barChart {
    static void printBar(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j <= input[i]; j++) {
                System.out.print("*"); 
                }
                System.out.println(" ");

        }
    }

    public static void main(String[] args) {
        printBar(new int[] { 1, 4, 2, 5 });
    }
}
