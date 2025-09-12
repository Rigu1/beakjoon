import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final int LEN = 8;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int taget = Integer.parseInt(br.readLine());
        int count = 0;
        int num = 666;

        while (true) {
            if (String.valueOf(num).contains("666")) {
                count++;
                if (count == taget) {
                    break;
                }
            }
            num++;
        }

        bw.write(String.valueOf(num));
        bw.flush();
    }
}
