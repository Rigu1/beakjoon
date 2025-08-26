import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long input = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(input * input * input));
        bw.newLine();
        bw.write('3');
        bw.flush();
    }
}
