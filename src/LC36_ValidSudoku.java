import java.util.HashSet;

public class LC36_ValidSudoku {
    public boolean solution (char[][] board){
        int n = 9;
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] boxs = new HashSet[n];
        for(int i = 0 ; i < n ; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxs[i] = new HashSet<>();
        }
        for(int row =  0 ; row<  n ;row++){
            for(int col = 0 ; col <n ;col++) {
                char val = board[row][col];
                if(val == '.'){
                    continue;
                }
                if (rows[row].contains(val)) {
                    return false;
                }
                rows[row].add(val);
                if (cols[col].contains(val)) {
                    return false;
                }
                cols[col].add(val);

                int idx = (row / 3 * 3 + col / 3);
                if(boxs[idx].contains(val)){
                    return false;
                }
                boxs[idx].add(val);
            }
        }
        return true;

    }
}
