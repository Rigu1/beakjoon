import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] info = Arrays.stream(br.readLine()
                                   .split(" "))
                         .mapToInt(Integer::parseInt)
                         .toArray();

        int[] dp = new int[info[1] + 1];
        dp[0] = 1;

        for (int i = 1; i <= info[0]; i++) {
            for (int j = Math.min(i, info[1]); j > 0; j--) {
                dp[j] = (dp[j] + dp[j - 1]) % 10007;
            }
        }

        bw.write(String.valueOf(dp[info[1]]));
        bw.flush();
    }
}
