import java.util.*;
public class MyFavoriteApp {
    public static String removeOuterParentheses(String S) {

        String result = "";
        int left = 0;
        int right = 0;
        List<Integer> concate = new ArrayList<>();

        for (int i = 0; i <= S.length()-1; i++)
        {
            char ch = S.charAt(i);

            if(ch == '(')
            {
                left++;
            }
            if(ch == ')')
            {
                right++;
            }
            if(left == right)
            {
                concate.add(i);
            }
        }

        int beginIndex = 1;
        for(int j = 0; j < concate.size(); j++)
        {
            result = result + S.substring(beginIndex,concate.get(j));
            beginIndex = concate.get(j) + 2;
        }

        S = result;
        return S;
    }

    public static void main(String[] args)
    {
        String test1 = "(()())(())"; // "()()()"
        String test2 = "(()())(())(()(()))"; // "()()()()(())"
        String test3 = "()()"; // ""

        System.out.println(removeOuterParentheses(test1));
        System.out.println(removeOuterParentheses(test2));
        System.out.println(removeOuterParentheses(test3));



    }
}

