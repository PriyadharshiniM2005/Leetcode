// Last updated: 2/9/2026, 4:09:43 PM
class Solution {
    public static int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int num : nums) {
            elementSum += num;
            int temp = num;
            while (temp > 0) {
                digitSum += temp % 10;
                temp /= 10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 15, 6, 3};
        System.out.println(differenceOfSum(nums1));  
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(differenceOfSum(nums2)); 
    }
} 

     