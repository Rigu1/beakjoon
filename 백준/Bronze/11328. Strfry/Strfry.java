import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static int[] counterAlphabet(String text) {
        int[] counter = new int[26];
        for (int i = 0; i < text.length(); i++) {
            int index = text.charAt(i) - 'a';
            counter[index] += 1;
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int[] firstCounter = counterAlphabet(stringTokenizer.nextToken());
            int[] secondCounter = counterAlphabet(stringTokenizer.nextToken());

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
        }

        bufferedWriter.flush();
    }
}
