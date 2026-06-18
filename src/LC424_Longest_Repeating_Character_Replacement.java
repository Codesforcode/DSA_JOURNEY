public class LC424_Longest_Repeating_Character_Replacement {
    public int solution(String s , int k){
        int low = 0 ;
        int maxFreq =  0;
        int ans = 0 ;
        int [] freq = new int [26];
        for(int high = 0 ; high<s.length();high++){
            freq[s.charAt(high)-'A']++;
            int stringLen = high-low+1;
            maxFreq = Math.max(maxFreq,freq[s.charAt(high)-'A']);
            while(stringLen - maxFreq > k ){
                freq[s.charAt(low)-'A']--;
                low++;
                stringLen  = high-low+1;
            }
            ans = Math.max(ans,stringLen);
        }
        return ans;
    }

}
