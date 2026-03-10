import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static int[] countingAlphabet(String Line) {
        int[] counter = new int[26];

        for (char ch : Line.toCharArray()) {
            int index = ch - 'a';
            counter[index] += 1;
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] firstArr = countingAlphabet(bufferedReader.readLine());
        int[] secondArr = countingAlphabet(bufferedReader.readLine());

        int total = 0;
        for (int i = 0; i < 26; i++) {
            int temp = Math.abs(firstArr[i] - secondArr[i]);
            total += temp;
        }

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.flush();
    }
}
