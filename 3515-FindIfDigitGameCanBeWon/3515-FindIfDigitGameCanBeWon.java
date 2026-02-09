// Last updated: 2/9/2026, 4:09:40 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int singledigit=0;
        int doubledigit=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(num<10){
                singledigit+=num;
            }
            else{
                doubledigit+=num;
            }
        }
        return singledigit != doubledigit;
    }
}