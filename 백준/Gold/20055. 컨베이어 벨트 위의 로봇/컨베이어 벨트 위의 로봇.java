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

        int[] info = Arrays.stream(br.readLine()
                                     .split(" "))
                           .mapToInt(Integer::parseInt)
                           .toArray();

        int len = info[0] * 2;
        int breakPoint = info[1];
        int[] durability = new int[len];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < len; i++) {
            durability[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int countRound = 0;
        int count = 0;
        int[] robotInfo = new int[len];

        do {
            countRound += 1;
            start = (start - 1 + len) % len;
            int end = (start - 1 + (len / 2)) % len;

            if (robotInfo[end] == 1) {
                robotInfo[end] = 0;
            }

            for (int i = len / 2 - 2; i >= 0; i--) {
                int now = (start + i) % len;
                int next = (start + i + 1) % len;

                if (robotInfo[now] == 1) {
                    if (robotInfo[next] == 0 && durability[next] != 0) {
                        robotInfo[now] = 0;
                        durability[next] -= 1;
                        if (durability[next] == 0) {
                            count += 1;
                        }
                        if (next != end) {
                            robotInfo[next] = 1;
                        }
                    }
                }
            }

            if (durability[start] != 0) {
                robotInfo[start] = 1;
                durability[start] -= 1;

                if (durability[start] == 0) {
                    count += 1;
                }
            }

        } while (count < breakPoint);

        bw.write(String.valueOf(countRound));
        bw.flush();
    }
}
