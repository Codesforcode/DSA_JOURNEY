import java.util.HashSet;

public class LC128_LongestSeubsequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;

        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int lcs = 1;
        for (int num : set) {
            if (set.contains(num - 1)) {
                continue;
            } else {
                int freq = 1;
                while (set.contains(num + 1)) {
                    freq++;
                    num++;

                }
                lcs = Math.max(lcs, freq);
            }
        }
        return lcs;

    }
}
