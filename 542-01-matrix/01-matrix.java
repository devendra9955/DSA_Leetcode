class Solution {

    public class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int[][] updateMatrix(int[][] mat) {

        Queue<Pair> q = new LinkedList<>();

        int m = mat.length;
        int n = mat[0].length;

        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(ans[i], -1);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (mat[i][j] == 0) {
                    q.add(new Pair(i, j));
                    ans[i][j] = 0;
                }
            }
        }

        while (q.size() > 0) {

            Pair front = q.remove();

            int row = front.row;
            int col = front.col;

            if (col - 1 >= 0 && ans[row][col - 1] == -1) {

                ans[row][col - 1] = ans[row][col] + 1;
                q.add(new Pair(row, col - 1));
            }

            if (col + 1 < n && ans[row][col + 1] == -1) {

                ans[row][col + 1] = ans[row][col] + 1;
                q.add(new Pair(row, col + 1));
            }

            if (row - 1 >= 0 && ans[row - 1][col] == -1) {

                ans[row - 1][col] = ans[row][col] + 1;
                q.add(new Pair(row - 1, col));
            }

            if (row + 1 < m && ans[row + 1][col] == -1) {

                ans[row + 1][col] = ans[row][col] + 1;
                q.add(new Pair(row + 1, col));
            }
        }

        return ans;
    }
}