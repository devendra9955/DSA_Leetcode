class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q= new LinkedList<>();
        int count = 0;
        for(int j=0; j<n; j++){
            if(grid[0][j]==1) {
                q.add(new Pair(0,j));
                grid[0][j] = -1;
            };
            if(grid[m-1][j]==1) {
                grid[m-1][j] = -1;
                q.add(new Pair(m-1,j));
            }
        }
        for(int i=0; i<m; i++){
            if(grid[i][0] == 1) {
                q.add(new Pair(i,0));
                grid[i][0] = -1;
            }
            if(grid[i][n-1]==1) {
                q.add(new Pair(i,n-1));
                grid[i][n-1] = -1;
            }
        }
        while(q.size() > 0){
            Pair front = q.remove();
            int row = front.row;
            int col = front.col;
            if(row-1 >= 0 && grid[row-1][col]==1) {//uppar
                q.add(new Pair(row-1,col));
                grid[row-1][col] = -1;
            }
            if(row+1 < m  && grid[row+1][col]==1) {//uppar
                q.add(new Pair(row+1,col));
                grid[row+1][col] = -1;
            }
            if(col-1 >= 0 && grid[row][col-1]==1){//left
                q.add(new Pair(row, col-1));
                grid[row][col-1] = -1;
            }
            if(col+1<n && grid[row][col+1]==1){//right
                q.add(new Pair(row,col+1));
                grid[row][col+1] = -1;
             
            }
        
        }
        for(int i=1; i<m-1; i++){
            for(int j=1; j<n-1; j++){
                if(grid[i][j] == 1) count++;
            }
        }
        return count;


    }
}