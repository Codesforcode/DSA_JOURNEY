import java.util.HashSet;

public class LC3_LongestSubstringWithoutRepeatingCharacter {
    public int solution(String s){
        if(s==null || s.isEmpty()){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        int left = 0 ;
        int ans = 1 ;
        HashSet<Character> set = new HashSet<>();
        for(int right = 0; right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}
