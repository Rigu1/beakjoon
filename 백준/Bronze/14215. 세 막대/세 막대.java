import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max = Math.max(Math.max(a, b), c);
        int sum = a + b + c;

        if (max - (sum - max) + 1 > 0) {
            int gap = max - (sum - max) + 1;
            sum -= gap;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
    }
}
