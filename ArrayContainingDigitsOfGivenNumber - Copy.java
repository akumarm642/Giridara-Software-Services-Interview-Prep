import java.util.ArrayList;

public class ArrayContainingDigitsOfGivenNumber {
    public static void main(String[] args) {
        int n = 4234324;
        ArrayList<Integer> arr = new ArrayList<>();
        while (n != 0) {
            arr.add(n % 10);
            n = n / 10;
        }
        System.out.println(arr.reversed());
    }
}
