import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int xMax = Integer.MIN_VALUE;
        int xMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
            int yMin = Integer.MAX_VALUE;

            while (count-- > 0){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                xMax = Math.max(xMax, x);
                xMin = Math.min(xMin, x);
                yMax = Math.max(yMax, y);
                yMin = Math.min(yMin, y);
            }

            System.out.println((xMax - xMin) * (yMax - yMin));
        }
    }
