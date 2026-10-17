class Solution {
    public boolean canAliceWin(int n) {
        int ten = 10;
        int temp = n;
        int alicecount=0;
        int bobcount=0;
        while(n > 0){
            int alice = temp-ten;
            if(alice < 0) break; 
            alicecount++;
            ten--;
            int bob = alice-ten;
            if(bob < 0) break;
            bobcount++;
            ten--;
            temp = bob;
        }
        if(alicecount > bobcount) return true;
        return false;
    }
}