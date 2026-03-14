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
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] info = Arrays.stream(br.readLine()
                                     .split(" "))
                           .mapToInt(Integer::parseInt)
                           .toArray();

        Map<Integer, List<int[]>> numberInfo = new HashMap<>();

        int result = 0;

        for (int y = 0; y < info[0]; y++) {
            String line = br.readLine();
            for (int x = 0; x < info[1]; x++) {
                int num = line.charAt(x) - '0';
                if (!numberInfo.containsKey(num)) {
                    numberInfo.put(num, new ArrayList<>());
                }
                numberInfo.get(num).add(new int[]{x, y});
            }
        }

        for (int i = 0; i < 10; i++) {
            List<int[]> pointInfo = numberInfo.get(i);
            if (pointInfo == null) continue;

            Map<Integer, List<Integer>> rowInfoFromCol = new HashMap<>();
            for (int[] point : pointInfo) {
                int x = point[0];
                int y = point[1];
                rowInfoFromCol.computeIfAbsent(y, val -> new ArrayList<>()).add(x);
            }

            List<Integer> cols = new ArrayList<>(rowInfoFromCol.keySet());
            cols.sort(null);

            for (int j = 0; j < cols.size(); j++) {
                for (int k = j + 1; k < cols.size(); k++) {
                    int y1 = cols.get(j);
                    int y2 = cols.get(k);
                    int h = y2 - y1;

                    List<Integer> arr1 = rowInfoFromCol.get(y1);
                    List<Integer> arr2 = rowInfoFromCol.get(y2);

                    List<Integer> commonPoint = new ArrayList<>();
                    int p1 = 0, p2 = 0;

                    while (p1 < arr1.size() && p2 < arr2.size()) {
                        int x1 = arr1.get(p1);
                        int x2 = arr2.get(p2);
                        if (Objects.equals(x1, x2)) {
                            commonPoint.add(x1);
                            p1++; p2++;
                        } else if (x1 < x2) { p1++; }
                        else { p2++; }
                    }

                    int b = 0;
                    for (int a = 0; a < commonPoint.size(); a++) {
                        while (b < commonPoint.size() && commonPoint.get(b) - commonPoint.get(a) < h) {
                            b++;
                        }
                        if (b < commonPoint.size() && commonPoint.get(b) - commonPoint.get(a) == h) {
                            result = Math.max(result, (h + 1) * (h + 1));
                        }
                    }
                }
            }
        }

        if (result == 0) {
            result = 1;
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}
