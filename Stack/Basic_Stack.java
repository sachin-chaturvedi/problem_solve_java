import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Basic_Stack {
    public static boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);
            if (str == '(' || str == '[' || str == '{') {
                s1.push(str);
            } else {

                if ((str == ')' && s1.peek() != '(') || (str == ']' && s1.peek() != '[')
                        || (str == '}' && s1.peek() != '{')) {
                    return false;
                }
                if ((str == ')' && s1.peek() == '(') || (str == ']' && s1.peek() == '[')
                        || (str == '}' && s1.peek() == '{')) {
                    s1.pop();
                }

            }
        }
        if (s1.empty()) {
            return true;
        }

        return false;

    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> str = new Stack<>();
        // char[] ch = new char[tokens.length];
        int result = 0;
        for (int i = 0; i < tokens.length; i++) {
            char ch = tokens[i].charAt(0);
            int ascii = (int) ch;
            if (ascii > 47 && ascii < 58) {
                str.push(ch + '0');

            } else {
                int a = str.pop();
                int b = str.pop();
                int ans = 0;
                if (ch == '+') {
                    ans = a + b;
                }
                if (ch == '-') {
                    ans = a - b;
                }
                if (ch == '*') {
                    ans = a * b;
                }
                if (ch == '/') {
                    ans = a / b;
                }

                str.push(ans);
                ans = 0;
            }
        }
        if (!str.isEmpty()) {
            result = str.peek();
        }
        return result;

    }
    public static
    

    public static void main(String[] args) {
        // Queue<Integer> first = new LinkedList<>();
        // Stack<Character> S_first = new Stack<>();
        // S_first.push('a');
        //  S_first.push('b');
        //   S_first.push('c');
        //   System.out.print(S_first);
        

        // first.add(1);
        // first.add(2);
        // first.add(3);
        // first.add(4);
        // first.add(5);
        // String s1 = "..";
        // for(int i = 0; i<s1.length();i++){
        // char ch = s1.charAt(i);
        // System.out.println(ch);
        // }

        // String s = "]";
        // System.out.println(isValid(s));

        // while(first.size()>0){
        // System.out.println(first.peek()+" ");
        // S_first.add(first.remove());
        // first.add(S_first.pop());

        // }
        // System.out.println("this is the peek element in this element in the array ");

        // char ch = '+';
        // int ascii = (int)ch;
        // System.out.println((char)ascii);


        Queue<Integer> qu = new LinkedList<>();
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(6);
        System.out.println(qu.peek());
        // qu.remove();
        System.out.println(qu.peek());
        qu.add(7);
        qu.add(9);
        System.out.println(qu);

    }

}
