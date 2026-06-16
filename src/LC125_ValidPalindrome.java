public class LC125_ValidPalindrome {
    public static boolean check(String s) {
        String ans = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = ans.length() - 1;
        while (start <= end) {
            if (ans.charAt(start) != ans.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }

    //[^a-zA-Z0-9] regex hai ye iska mtlv a-z or A-Z or 0-9 ko chorke sb ko hta do or lowercase me bdlo

}
