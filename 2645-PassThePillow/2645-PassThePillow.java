// Last updated: 2/9/2026, 4:09:42 PM
class Solution {
    public int passThePillow(int n, int time) {
       int turn=((n-1)*2);
       time%=turn;
       if(time<n) return time+1;
       return (turn-time+1); 
    }
}