public class PrintOnNums {
    public static void main(String[] args) {
        String str = "a10b5c";
        int n = 0;
        System.out.println();
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {

            if (Character.isAlphabetic(str.charAt(i))) {
                ch = str.charAt(i);
                System.out.print(ch);
            } else {
                char chr;
                while (i < str.length() && Character.isDigit(chr = str.charAt(i))) {
                    n = n * 10 + chr - '0';
                    i++;
                }
                i--;
                for (int j = 0; j < n - 1; j++) {
                    System.out.print(ch);
                }
                n = 0;
            }

        }
    }
}
