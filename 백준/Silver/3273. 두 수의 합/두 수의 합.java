import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        int taget = Integer.parseInt(bufferedReader.readLine());

        int count = 0;
        HashSet<Integer> vst = new HashSet<>();
        for (int number : numbers) {
            if (vst.contains(taget - number)) {
                count += 1;
            }
            vst.add(number);
        }

        bufferedWriter.write(String.valueOf(count));
        bufferedWriter.flush();
    }
}
