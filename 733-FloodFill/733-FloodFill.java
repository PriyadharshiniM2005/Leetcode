// Last updated: 2/9/2026, 4:10:18 PM
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int currentColor = image[sr][sc];
        if (currentColor == color) {
            return image;
        }
        dfs(image, sr, sc, currentColor, color);
        return image;
    }
 private void dfs(int[][] image, int row, int col, int oldColor, int newColor) {
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length || image[row][col] != oldColor) {
            return;
        }
        image[row][col] = newColor;
        dfs(image, row + 1, col, oldColor, newColor); 
        dfs(image, row - 1, col, oldColor, newColor);
        dfs(image, row, col + 1, oldColor, newColor);
        dfs(image, row, col - 1, oldColor, newColor); 
    }
}
