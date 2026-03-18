import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<String> lines = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            lines.add(br.readLine());
        }

        lines.sort(String::compareToIgnoreCase);
        int count = n;

        for (int i = 1; i < lines.size(); i++) {
            if (lines.get(i).startsWith(lines.get(i - 1))) {
                count -= 1;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
    }
}
