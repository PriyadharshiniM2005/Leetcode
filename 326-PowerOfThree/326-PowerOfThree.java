// Last updated: 2/9/2026, 4:10:40 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true; 
        }
        if (n <= 0 || n % 3 != 0) {
            return false;
        }
        return isPowerOfThree(n / 3);
    }
}
