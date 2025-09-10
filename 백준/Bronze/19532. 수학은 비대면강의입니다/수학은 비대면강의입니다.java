import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }

        int start = -999;
        int end = 999;

        outer:
        for (int x = start; x <= end; x++) {
            for (int y = start; y <= end; y++) {
                if(calculateExpression(x, y)) {
                    bw.write(x + " " + y);
                    break outer;
                }
            }
        }

        bw.flush();
    }

    private static boolean calculateExpression(int x, int y) {
        return numbers.get(0) * x + numbers.get(1) * y == numbers.get(2) && (numbers.get(3) * x + numbers.get(4) * y == numbers.get(5));
    }
}