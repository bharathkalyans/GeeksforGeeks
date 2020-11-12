import java.util.ArrayDeque;

public class BalancedParenthesis {
    boolean matching(char A,char B){
        return (('(' == A && ')' == B)
                || ('{' == A && '}' == B)
                || ('[' == A && ']' == B)
        );
    }

    boolean isBalanced(String str){
        ArrayDeque<Character> s=new ArrayDeque<>();
        for (int i=0;i<str.length();i++){
            char character=str.charAt(i);
            if(character == '(' || character == '{' || character== '[')
                s.push(str.charAt(i));

            else{
             if(s.isEmpty())
                 return false;
             if(!matching(s.peek(),character))
                    return false;
             else
                 s.pop();
            }

        }
        return  s.isEmpty();
    }

    public static void main(String[] args) {
        BalancedParenthesis b=new BalancedParenthesis();
        String str="({}[()])";
        System.out.println(b.isBalanced(str));
    }
}
