import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];

        for (int i = 0; i < n; i++) {
            map[i] = br.readLine()
                       .chars()
                       .map(ch -> ch - '0')
                       .toArray();
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> queue = new LinkedList<>();
        boolean[][][] vst = new boolean[n][m][2];

        queue.add(new int[]{0, 0, 0, 1});
        int result = -1;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int y = cur[0];
            int x = cur[1];
            int broken = cur[2];
            int dist = cur[3];

            if (y == n - 1 && x == m - 1) {
                result = dist;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                    if (map[ny][nx] == 0 && !vst[ny][nx][broken]) {
                        vst[ny][nx][broken] = true;
                        queue.add(new int[]{ny, nx, broken, dist + 1});
                    }
                    if (map[ny][nx] == 1 && broken == 0 && !vst[ny][nx][1]) {
                        vst[ny][nx][1] = true;
                        queue.add(new int[]{ny, nx, 1, dist + 1});
                    }
                }
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}
