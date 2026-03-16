import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());
            int count = 0;

            count += 1;
            count += target / 2;

            for (int j = 1; j <= target / 3; j++) {
                int rest = target - (j * 3);

                count += 1;
                count += rest / 2;
            }

            bw.write(String.valueOf(count));
            bw.newLine();
        }


        bw.flush();
    }
}
