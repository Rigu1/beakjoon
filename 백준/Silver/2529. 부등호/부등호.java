import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] signs = Arrays.stream(br.readLine()
                                         .split(" "))
                               .toArray(String[]::new);

        Stack<Integer> buffer = new Stack<>();
        for (int i = 0; i <= n; i++) {
            buffer.add(9 - i);

            if (i == n || signs[i].equals(">")) {
                while (!buffer.isEmpty()) {
                    bw.write(String.valueOf(buffer.pop()));
                }
            }
        }
        bw.newLine();
        for (int i = 0; i <= n; i++) {
            buffer.add(i);
            if (i == n || signs[i].equals("<")) {
                while (!buffer.isEmpty()) {
                    bw.write(String.valueOf(buffer.pop()));
                }
            }
        }
        

        bw.flush();
    }
}
