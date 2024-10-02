import java.util.Stack;

public class BalanceTheBrackets {
    public static void main(String[] args) {
        String st = "((((ab)";
        Stack<Integer> stk = new Stack<>();
        boolean[] remove = new boolean[st.length()];
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch == '(') {
                stk.push(i);
            } else if (ch == ')') {
                if (!stk.isEmpty()) {
                    stk.pop();
                } else {
                    remove[i] = true;
                }
            }
        }

        while (!stk.isEmpty()) {
            remove[stk.pop()] = true;
        }

        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < st.length(); i++) {
            if (!remove[i]) {
                stb.append(st.charAt(i));
            }
        }
        System.out.println(stb);
    }
}
