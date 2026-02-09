// Last updated: 2/9/2026, 4:09:52 PM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            boolean k = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (allowed.indexOf(words[i].charAt(j)) == -1) {
                    k = false;
                    break;
                }
            }
            if (k) count++;
        }

        return count;
    }
}
