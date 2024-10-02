public class PrintNumbersInWords {
    String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven",
            "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
    String[] tens = { "", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

    public static void main(String[] args) {
        int n = 6423;
        StringBuilder sb = new StringBuilder();
        PrintNumbersInWords pnw = new PrintNumbersInWords();
        System.out.println();
        if (n / 1000 > 0) {
            sb.append(pnw.ConvertHundereds(n / 1000)).append(" Thousand ");
            n = n % 1000;
        }

        if (n > 0) {
            sb.append(pnw.ConvertHundereds(n));
        }
        System.out.println(sb.toString());
    }

    String ConvertHundereds(int n) {
        StringBuilder partial = new StringBuilder();
        if (n / 100 > 0) {
            partial.append(units[n / 100]).append(" Hundred ");
            if (n % 100 > 0) {
                partial.append("and ");
            }
        }
        n = n % 100;
        if (n < 20) {
            partial.append(units[n]);
        } else {
            partial.append(tens[n / 10]);
            if (n % 10 > 0)
                partial.append(" ").append(units[n % 10]);
        }
        return partial.toString();
    }
}
