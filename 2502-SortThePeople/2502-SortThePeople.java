// Last updated: 2/9/2026, 4:09:45 PM
class Solution {
    public String[] sortPeople(String[] arr, int[] h) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (h[j] < h[j + 1]) {
                    int tempHeight = h[j];
                    h[j] = h[j + 1];
                    h[j + 1] = tempHeight;
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
