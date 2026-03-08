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

        String line = bufferedReader.readLine();
        int num = Integer.parseInt(line);

        int[] arr = new int[9];

        while (num > 0) {
            int index = num % 10;
            if (index == 9) {
                index = 6;
            }
            arr[index] += 1;

            num /= 10;
        }

        arr[6] = (arr[6] - 1) / 2 + 1;

        int max = Arrays.stream(arr)
                        .max()
                        .getAsInt();

        bufferedWriter.write(String.valueOf(max));
        bufferedWriter.flush();
    }
}