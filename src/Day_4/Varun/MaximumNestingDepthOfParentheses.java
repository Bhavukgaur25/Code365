package Day_4.Varun;

public class MaximumNestingDepthOfParentheses {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int maxDepth = maxDepth(s);
        System.out.println(maxDepth);
    }

    private static int maxDepth(String s) {
        int cnt = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')cnt++;
            else if(s.charAt(i) ==')')cnt--;
            max = Math.max(cnt,max);
        }
        return max;
    }
}
