public class PrintPrimeNumbersFrom100to1000 {
    public static void main(String[] args) {
        int k = 0;
        System.out.println();
        for (int i = 100; i <= 1000; i++) {
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    k = 1;
                }
            }
            if (k != 1) {
                System.out.print(i + " ");
            }
            k = 0;
        }
    }
}
