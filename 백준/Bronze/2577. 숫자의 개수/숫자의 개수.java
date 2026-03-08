import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = 1;

        for (int i = 0; i < 3; i++) {
            String line = bufferedReader.readLine();
            if (line != null && !line.trim().isEmpty()) {
                total *= Integer.parseInt(line.trim());
            }
        }

        int[] counter = new int[10];

        while (total > 10) {
            counter[total % 10] += 1;
            total /= 10;
        }
        counter[total] += 1;

        String result = Arrays.stream(counter)
                              .mapToObj(String::valueOf)
                              .collect(Collectors.joining(" "));

        bufferedWriter.write(result);
        bufferedWriter.flush();
    }
}