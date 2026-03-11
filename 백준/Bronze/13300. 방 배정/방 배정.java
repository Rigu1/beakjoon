import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] info = Arrays.stream(bufferedReader.readLine().split(" "))
                           .mapToInt(Integer::parseInt)
                           .toArray();

        int[][] studentsInfo = new int[2][6];

        for (int i = 0; i < info[0]; i++) {
            int[] studentInfo = Arrays.stream(bufferedReader.readLine().split(" "))
                                      .mapToInt(Integer::parseInt)
                                      .toArray();

            studentsInfo[studentInfo[0]][studentInfo[1] - 1] += 1;
        }

        int count = 0;
        for (int[] singleGenderInfo : studentsInfo) {
            for (int numOfStudent : singleGenderInfo) {
                if (numOfStudent != 0) {
                    count += (numOfStudent - 1) / info[1] + 1;
                }
            }
        }

        bufferedWriter.write(String.valueOf(count));
        bufferedWriter.flush();
    }
}
