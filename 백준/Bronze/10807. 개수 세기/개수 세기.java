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

        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = Arrays.stream(bufferedReader.readLine().split(" "))
                          .mapToInt(Integer::parseInt)
                          .toArray();
        int taget = Integer.parseInt(bufferedReader.readLine());

        long result = Arrays.stream(arr)
                            .filter(el -> el == taget)
                            .count();

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.flush();
    }
}
