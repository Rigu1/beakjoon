import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int sum = a + b + c;
            int max = Math.max(a, Math.max(b, c));

            if (sum == 0) {
                break;
            }

            if (max >= sum - max){
                bw.write("Invalid");
                bw.newLine();
                continue;
            }

            bw.write(getShapeType(a, b, c));
            bw.newLine();
        }

        bw.flush();
    }

    public static String getShapeType(int a, int b, int c) {
        if (a != b && b != c && c != a) {
            return "Scalene";
        }

        if (a == b && b == c){
            return "Equilateral";
        }

        return "Isosceles";
    }
}
