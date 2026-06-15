import java.util.Arrays;

public class LC238_ProductOfArrayExceptItself {
    public static  int [] solution (int [] arr){
        int [] ans = new int[arr.length];
        int pre = 1;
        int post  = 1;
        Arrays.fill(ans,1);
        for(int i = 0 ; i < arr.length ; i++){
            ans[i] = pre;
            pre = pre * arr[i];
        }
        for(int i = arr.length-1; i >=0 ; i-- ){
            ans[i] = ans[i] * post;
            post = arr[i] * post;
        }
        return ans;
    }

    static void main() {
        int [] arr = {1,2,3,4,5};
       for(int num : solution(arr)){
           System.out.println(num);
       }
    }
}
