class Pair {
    int score;
    int ways;

    Pair(int score, int ways) {
        this.score = score;
        this.ways = ways;
    }
}

class Solution {

    int MOD = 1000000007;
    Pair[][] dp;
    boolean[][] vis;

    public Pair path(int i, int j, List<String> board) {

        if (i < 0 || j < 0)
            return new Pair(Integer.MIN_VALUE, 0);

        if (vis[i][j])
            return dp[i][j];

        char ch = board.get(i).charAt(j);

        if (ch == 'X')
            return new Pair(Integer.MIN_VALUE, 0);

        if (ch == 'E')
            return new Pair(0, 1);

        Pair up = path(i - 1, j, board);
        Pair left = path(i, j - 1, board);
        Pair diag = path(i - 1, j - 1, board);

        int maxScore = Math.max(up.score, Math.max(left.score, diag.score));

        if (maxScore == Integer.MIN_VALUE) {
            vis[i][j] = true;
            dp[i][j] = new Pair(Integer.MIN_VALUE, 0);
            return dp[i][j];
        }

        int ways = 0;

        if (up.score == maxScore)
            ways = (ways + up.ways) % MOD;

        if (left.score == maxScore)
            ways = (ways + left.ways) % MOD;

        if (diag.score == maxScore)
            ways = (ways + diag.ways) % MOD;

        int value = 0;
        if (ch >= '0' && ch <= '9')
            value = ch - '0';

        Pair ans = new Pair(maxScore + value, ways);

        vis[i][j] = true;
        dp[i][j] = ans;

        return ans;
    }

    public int[] pathsWithMaxScore(List<String> board) {

        int m = board.size();
        int n = board.get(0).length();

        dp = new Pair[m][n];
        vis = new boolean[m][n];

        Pair ans = path(m - 1, n - 1, board);

        if (ans.ways == 0)
            return new int[] {0, 0};

        return new int[] {ans.score, ans.ways};
    }
}