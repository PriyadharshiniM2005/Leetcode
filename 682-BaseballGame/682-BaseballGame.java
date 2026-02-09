// Last updated: 2/9/2026, 4:10:22 PM
class Solution {
    public int calPoints(String[] operations) {
        int[] scores = new int[operations.length];
        int index = 0;
        for (String op : operations) {
            if (op.equals("+")) {
                scores[index] = scores[index - 1] + scores[index - 2];
                index++;
            } else if (op.equals("D")) {
                scores[index] = 2 * scores[index - 1];
                index++;
            } else if (op.equals("C")) {
                index--; 
            } else {
                scores[index] = Integer.parseInt(op);
                index++;
            }
        }
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += scores[i];
        }
        return sum;
    }
}
