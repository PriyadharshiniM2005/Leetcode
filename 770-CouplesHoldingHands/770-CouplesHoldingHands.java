// Last updated: 2/9/2026, 4:10:15 PM
import java.util.*;

public class Solution {
    public int minSwapsCouples(int[] row) {
        int n = row.length;
        int[] pos = new int[n]; 
        for (int i = 0; i < n; i++) {
            pos[row[i]] = i;
        }
        int swaps = 0;
        for (int i = 0; i < n; i += 2) {
            int first = row[i];
            int expectedPartner = first ^ 1; 
            if (row[i + 1] != expectedPartner) {
                swaps++;
                int partnerIndex = pos[expectedPartner];
                int temp = row[i + 1];
                row[i + 1] = row[partnerIndex];
                row[partnerIndex] = temp;
                pos[temp] = partnerIndex;
                pos[expectedPartner] = i + 1;
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] row1 = {0, 2, 1, 3};
        System.out.println(solution.minSwapsCouples(row1)); 
        int[] row2 = {3, 2, 0, 1};
        System.out.println(solution.minSwapsCouples(row2)); 
    }
}
