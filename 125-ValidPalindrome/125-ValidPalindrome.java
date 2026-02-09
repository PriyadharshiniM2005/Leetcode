// Last updated: 2/9/2026, 4:11:08 PM
class Solution {
    public boolean isPalindrome(String s) {      
        if(s.length()==0){
            return true;
        }
        int i= 0;
        int j= s.length()-1;
           while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))) {

                i++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
           else if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))){
                i++;
                j--;
            }
            else{
            return false;
            }
           }
           return true;
       

        
    }
}