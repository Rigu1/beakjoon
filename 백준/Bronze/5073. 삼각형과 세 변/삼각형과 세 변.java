import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] lines = {
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            };

            int sum = Arrays.stream(lines).sum();
            int max = Arrays.stream(lines).max().getAsInt();

            if (sum == 0) {
                break;
            }

            if (max >= sum - max){
                bw.write("Invalid");
                bw.newLine();
                continue;
            }

            bw.write(getShapeType(lines));
            bw.newLine();
        }

        bw.flush();
    }

    public static String getShapeType(int[] arr) {
        if (arr[0] != arr[1] && arr[1] != arr[2] && arr[2] != arr[0]) {
            return "Scalene";
        }

        if (arr[0] == arr[1] && arr[1] == arr[2]){
            return "Equilateral";
        }

        return "Isosceles";
    }
}
