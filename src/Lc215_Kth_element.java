import java.util.PriorityQueue;

public class Lc215_Kth_element {
    //find out the kth largest element without sorting
    public int solution(int [] nums , int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.offer(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();


    }
}
