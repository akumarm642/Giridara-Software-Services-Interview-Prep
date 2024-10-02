import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello";// revstr = "";
        // for(char ch : str.toCharArray()){
        // revstr=ch+revstr;
        // }
        char[] chr = str.toCharArray();
        for (int i = 0, j = chr.length - 1; i <= j; i++, j--) {
            char temp = chr[i];
            chr[i] = chr[j];
            chr[j] = temp;
        }
        System.out.println("Original String is " + str);
        // System.out.println("reverse String is "+ revstr);
        System.out.println("reverse String is " + Arrays.toString(chr));
    }

}