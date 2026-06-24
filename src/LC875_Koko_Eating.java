public class LC875_Koko_Eating {
    public boolean eat(int [] piles , int mid , int h){
        int hours = 0;
        for(int pile : piles){
            hours += (int) Math.ceil((double) pile/mid);
        }
        return hours<= h;
    }
    public int maxEatingSpeed(int[] piles , int h){
        int left = 1;
        int right = 1;
        for(int pile : piles){
            right = Math.max(right,pile);
        }
        while(left< right){
            int mid = left + (right-left)/2;
            if(eat(piles , mid , h)){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}
