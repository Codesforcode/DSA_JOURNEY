import java.util.Stack;

public class LC739_Daily_Temperatures {
    public int[] solution(int [] temperatures ){
        int n = temperatures.length;
        int [] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i< n ;i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int index = stack.pop();
                ans[index] = i-index;

            }
            stack.push(i);
        }
        return ans;
    }
}
