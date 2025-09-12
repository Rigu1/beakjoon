import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final int LEN = 8;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int count = 0;

        while (true) {
            if (count * 3 > input) {
                bw.write("-1");
                break;
            }

            int taget = input;

            for (int i = 0; i < count; i++) {
                taget -= 3;
            }

            if (taget % 5 == 0) {
                bw.write(String.valueOf(count + ((input - (count * 3)) / 5)));
                break;
            }
            count++;
        }

        bw.flush();
    }
}
