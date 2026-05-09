class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int firstRow = 0;
        int firstCol = 0;
        int lastCol = matrix[0].length-1;
        int lastRow = matrix.length-1;
        while(firstCol <= lastCol && firstRow<=lastRow){
                for(int j=firstCol; j<=lastCol; j++){
                    ans.add(matrix[firstRow][j]);
                }
                firstRow++;
                if(firstRow > lastRow || firstCol>lastCol) break;
                for(int i=firstRow; i<=lastRow; i++){
                    ans.add(matrix[i][lastCol]);
                }
                lastCol--;
                    if(firstRow > lastRow || firstCol>lastCol) break;
                for(int j=lastCol; j>=firstCol; j--){
                    ans.add(matrix[lastRow][j]);
                }
                lastRow--;
                if(firstRow > lastRow || firstCol>lastCol) break;
                for(int i=lastRow; i>=firstRow; i--){
                    ans.add(matrix[i][firstCol]);
                }
                firstCol++;
                
        }
       return ans;
    }
}