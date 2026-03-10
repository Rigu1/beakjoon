import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());
        int[] firstCounter = new int[26];
        int[] secondCounter = new int[26];

        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            fillCounter(stringTokenizer.nextToken(), firstCounter);
            fillCounter(stringTokenizer.nextToken(), secondCounter);

            boolean flag = false;
            for (int j = 0; j < 26; j++) {
                if (firstCounter[j] != secondCounter[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                bufferedWriter.write("Impossible\n");
            } else {
                bufferedWriter.write("Possible\n");
            }

            Arrays.fill(firstCounter, 0);
            Arrays.fill(secondCounter, 0);
        }

        bufferedWriter.flush();
    }

    private static void fillCounter(String text, int[] counter) {
        for (int i = 0; i < text.length(); i++) {
            counter[text.charAt(i) - 'a']++;
        }
    }
}
