import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = 0;
        int y = 0;

        for (int i = 0; i < 3; i++) {
            String input = br.readLine();
            int[] parts = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();

            x = parts[0] ^ x;
            y = parts[1] ^ y;
        }

        System.out.println(x + " " + y);
    }
}
