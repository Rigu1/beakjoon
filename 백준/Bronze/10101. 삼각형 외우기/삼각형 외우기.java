import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        bw.write(getShapeType(a, b, c));
        bw.flush();
    }

    public static String getShapeType(int a, int b, int c) {
        if (a + b + c != 180){
            return "Error";
        }

        if (a != b && b != c && c != a) {
            return "Scalene";
        }

        if (a == b && b == c){
            return "Equilateral";
        }

        return "Isosceles";
    }
}
