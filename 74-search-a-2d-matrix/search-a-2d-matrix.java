class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int lo = 0;
        int hi = row*col-1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            int rowno = mid/col;
            int colno =mid%col;
            if(matrix[rowno][colno]==target) return true;
            else if(matrix[rowno][colno]>target) hi = mid-1;
            else lo = mid+1;

        }
        return false;
    }
}