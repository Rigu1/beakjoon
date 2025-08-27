import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n =  Integer.parseInt(st.nextToken());
        int m =  Integer.parseInt(st.nextToken());

        ArrayList<Integer> numbers = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }

        int result = findCombinations(n, m, numbers, 0, 0, 0);

        bw.write(String.valueOf(result));
        bw.flush();
    }

    public static int findCombinations(int len, int target, ArrayList<Integer> numbers, int index, int count, int sum) {
        if (sum > target) {
            return 0;
        }

        if (count == 3) {
            return sum;
        }

        int best = 0;

        for (int i = index; i < len; i++) {
            int resultFromChild = findCombinations(len, target, numbers, i + 1, count + 1, sum + numbers.get(i));

            if (resultFromChild > best) {
                best = resultFromChild;
            }
        }

        return best;
    }
}
