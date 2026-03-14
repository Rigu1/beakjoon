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

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] info = Arrays.stream(br.readLine()
                                     .split(" "))
                           .mapToInt(Integer::parseInt)
                           .toArray();

        int need = info[0];

        int minSixStringPrice = Integer.MAX_VALUE;
        int minOneStringPrice = Integer.MAX_VALUE;
        List<Integer> oneStringPriceInfo = new ArrayList<>();

        for (int i = 0; i < info[1]; i++) {
            int[] stringInfo = Arrays.stream(br.readLine()
                                               .split(" "))
                                     .mapToInt(Integer::parseInt)
                                     .toArray();

            minSixStringPrice = Math.min(stringInfo[0], minSixStringPrice);
            minOneStringPrice = Math.min(stringInfo[1], minOneStringPrice);
        }

        int setNum = need / 6;
        int restNum = need % 6;

        int result = 0;

        if (restNum > 0) {
            result = Math.min((setNum + 1) * minSixStringPrice,
                    Math.min(setNum * minSixStringPrice + restNum * minOneStringPrice, need * minOneStringPrice));
        } else {
            result = Math.min(setNum * minSixStringPrice, need * minOneStringPrice);
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}