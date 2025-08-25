import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(br.readLine());
        int xMax = Integer.MIN_VALUE;
        int xMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;

        while (count-- > 0){
            int[] info = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (info[0] > xMax){
                xMax = info[0];
            }
            if (info[0] < xMin){
                xMin = info[0];
            }
            if (info[1] > yMax){
                yMax = info[1];
            }
            if (info[1] < yMin){
                yMin = info[1];
            }
        }
        System.out.println((xMax - xMin) * (yMax - yMin));
    }
}
