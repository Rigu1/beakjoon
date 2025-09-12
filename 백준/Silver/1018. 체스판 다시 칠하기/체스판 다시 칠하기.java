import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final int LEN = 8;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int minCount = getMinCount(n, m, board);

        bw.write(String.valueOf(minCount));
        bw.flush();
    }

    private static int getMinCount(int n, int m, char[][] board) {
        int minCount = Integer.MAX_VALUE;

        for (int i = 0; i <= n - LEN; i++) {
            for (int j = 0; j <= m - LEN; j ++) {
                int count = 0;

                for(int row = i; row < i + LEN; row++) {
                    for(int col = j; col < j + LEN; col ++) {
                        if ((row + col) % 2 == 0) {
                            if (board[row][col] != 'W') {
                                count++;
                            }
                        } else {
                            if (board[row][col] != 'B') {
                                count++;
                            }
                        }
                    }
                }

                minCount = Math.min(minCount, Math.min(count, 64 - count));
            }
        }
        return minCount;
    }
}
