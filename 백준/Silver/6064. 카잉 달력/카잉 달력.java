import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rep = Integer.parseInt(br.readLine());
        for (int i = 0; i < rep; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int targetX = Integer.parseInt(st.nextToken());
            int targetY = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(findCount(m, n, targetX, targetY)));
            bw.newLine();
        }

        bw.flush();
    }

    private static int findCount(int m, int n, int targetX, int targetY) {
        if (targetY == n) targetY = 0;

        for (int i = targetX; i <= m * n; i += m) {
            if (i % n == targetY) {
                return i;
            }
        }
        return -1;
    }
}

