import static java.awt.SystemColor.info;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> extensions = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String extension = br.readLine().split("\\.")[1];
            extensions.merge(extension, 1, Integer::sum);
        }

        List<String> names = new ArrayList<>(extensions.keySet());
        names.sort(String::compareToIgnoreCase);

        for (String name : names) {
            bw.write(name + " " + extensions.get(name));
            bw.newLine();
        }

        bw.flush();
    }
}
