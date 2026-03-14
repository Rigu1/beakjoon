import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> inCars = new HashMap<>();
        List<Integer> outCars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            inCars.put(br.readLine(), i);
        }

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            outCars.add(inCars.get(line));
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (outCars.get(i) > outCars.get(j)) {
                    count++;
                    break;
                }
            }
        }
        
        bw.write(String.valueOf(count));
        bw.flush();
    }
}