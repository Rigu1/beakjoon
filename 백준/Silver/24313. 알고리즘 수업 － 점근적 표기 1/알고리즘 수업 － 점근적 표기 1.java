import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        if (c - num1 < 0) {
            bw.write(String.valueOf(0));
        }

        else if (c - num1 == 0) {
            if (num2 <= 0) {
                bw.write(String.valueOf(1));
            } else {
                bw.write(String.valueOf(0));
            }
        }

        else {
            if (num1 * n + num2 > c * n) {
                bw.write(String.valueOf(0));
            } else {
                bw.write(String.valueOf(1));
            }
        }

        bw.flush();
    }
}
