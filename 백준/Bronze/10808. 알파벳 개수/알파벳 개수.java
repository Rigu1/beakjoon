import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        int[] counts = new int[26];

        for (char ch : input.toCharArray()) {
            counts[ch - 'a'] += 1;
        }

        String result = Arrays.stream(counts)
                              .mapToObj(String::valueOf)
                              .collect(Collectors.joining(" "));

        bw.write(result);
        bw.flush();
    }
}