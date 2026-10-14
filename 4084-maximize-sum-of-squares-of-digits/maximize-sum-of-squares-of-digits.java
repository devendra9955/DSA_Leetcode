class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > 9 * num) return "";
        StringBuilder sb = new StringBuilder();
        while(sum >=9){
            sb.append('9');
            sum = sum - 9;
        }
        if(sum > 0){
            sb.append(sum);
        }
        while(num > sb.length()){
            sb.append('0');
        }

        return sb.toString();
    }
}