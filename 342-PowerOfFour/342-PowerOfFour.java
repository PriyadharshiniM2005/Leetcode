// Last updated: 2/9/2026, 4:10:37 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true; 
        }
        if (n <= 0 || n % 4 != 0) {
            return false;
        }
        return isPowerOfFour(n / 4);
    }
}
