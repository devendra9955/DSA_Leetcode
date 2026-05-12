class Solution {
    public boolean isPossible(int tasks[][] , int energy){
        for(int task[] : tasks){
            int actual = task[0];
            int minimum = task[1];
            if(energy < minimum) return false;
            energy -= actual;
        }
        return true;
    }
    public int minimumEffort(int[][] tasks) {
        int n = tasks.length;
        int result = 0;;
        int left = 0;
        int right = 1000000000;
        Arrays.sort(tasks,(a,b)->(b[1]-b[0])-(a[1]-a[0]));
        while(left <= right){
            int mid = left+(right-left)/2;
            if(isPossible(tasks,mid)){
                result = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return result;
    }
}