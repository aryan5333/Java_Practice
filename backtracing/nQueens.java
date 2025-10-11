import java.util.ArrayList;
import java.util.List;

public class nQueens {
    List<List<String>> solution;

    public static void main(String[] args) {
        nQueens sol = new nQueens();
        int n = 4; // Example value, you can change it
        List<List<String>> result = sol.solveNQueens(n);
        System.out.println(result);
    }

    public List<List<String>> solveNQueens(int n) {
        solution = new ArrayList<>();

        char[][]board=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='.';
            }
        }
        backtrack(board,0);

        return solution;
        
    }
    public void backtrack(char[][]board,int row){
        if(row==board.length){
            solution.add(convertTosolution(board));
        }
        else{
            for(int i=0;i<board[0].length;i++){
                if(isSafe(board,row,i)){
                    board[row][i]='Q';
                    backtrack(board,row+1);
                    board[row][i]='.';
                }
            }
        }
    }
    private boolean isSafe(char[][]board,int row,int col){
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        int i=row-1,j=col-1;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q'){
                return false;
            }
            i--;
            j--;
        }
         i=row-1;
         j=col+1;
        while(i>=0 && j<board[0].length){
            if(board[i][j]=='Q'){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
    private List<String>convertTosolution(char[][]board){
        List<String>solution=new ArrayList<>();
        for(char[]row:board){
            solution.add(new String(row));
        }
        return solution;
    }
}

