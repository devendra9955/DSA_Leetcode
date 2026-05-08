class Solution {
    public void rotate(int[][] matrix) {
       int m = matrix.length;
       int n = matrix[0].length;
       //transpose
       for(int i=0; i<m; i++){
        for(int j=0; j<i; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
       }
       //reverse each row 
       for(int i=0; i<m; i++){
        int startCol= 0;
        int endCol = n-1;
        while(startCol < endCol){
            int temp = matrix[i][startCol];
            matrix[i][startCol]=matrix[i][endCol];
            matrix[i][endCol]=temp;
            startCol++;
            endCol--;
        }
       }
    }
}