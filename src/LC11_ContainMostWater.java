public class LC11_ContainMostWater {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int area = 0;
        int max = 0;
        while (left < right) {
            int h = Math.min(heights[left], heights[right]);
            int w = right - left;
            area = h * w;
            max = Math.max(max, area);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }


}
