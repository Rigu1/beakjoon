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

                xMax = Math.max(xMax, info[0]);
                xMin = Math.min(xMin, info[0]);
                yMax = Math.max(yMax, info[1]);
                yMin = Math.min(yMin, info[1]);
            }

            System.out.println((xMax - xMin) * (yMax - yMin));
        }
    }
