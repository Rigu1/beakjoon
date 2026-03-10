import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static int[] counterAlphabet(String text) {
        int[] counter = new int[26];
        for (char ch : text.toCharArray()) {
            int index = ch - 'a';
            counter[index] += 1;
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            String[] temp = bufferedReader.readLine().split(" ");
            int[] firstCounter = counterAlphabet(temp[0]);
            int[] secondCounter = counterAlphabet(temp[1]);

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
