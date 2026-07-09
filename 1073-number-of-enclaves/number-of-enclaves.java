class Pair{
    int row;
    int col;
    Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public void bfs(int i, int j,int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        grid[i][j] = -1;
        while(q.size() > 0){
            Pair front = q.remove();
            int row = front.row;
            int col = front.col;
            if(col-1 >=0 && grid[row][col-1] == 1){
                grid[row][col-1]=-1;
                q.add(new Pair(row,col-1));
            }
            if(col+1 < n && grid[row][col+1]==1){
                grid[row][col+1] = -1;
                q.add(new Pair(row,col+1));
            }
            if(row-1>=0 && grid[row-1][col]==1){
                grid[row-1][col] = -1;
                q.add(new Pair(row-1,col));
            }
            if(row+1 < m && grid[row+1][col]==1){
                grid[row+1][col] = -1;
                q.add(new Pair(row+1,col));
            }
        }

    }
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if((i==0 || j==0 || i==m-1||j==n-1) && grid[i][j]==1){
                     bfs(i,j,grid);
                }
               
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1) count++;
            }
        }

        return count;
    }
}