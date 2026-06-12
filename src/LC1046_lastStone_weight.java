import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class LC1046_lastStone_weight {
   /*
    Input: stones = [2,7,4,1,8,1]
    Output: 1
    Explanation:
    We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
    we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
    we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
    we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.
    */
    public int solution (int [] stones){
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            pq.offer(stone);

        }
        while(pq.size()>1){
            pq.offer(pq.poll()- pq.poll());
        }
        return pq.peek();

    }
}
