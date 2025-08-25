import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<int[]> infos = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String input = sc.nextLine();
            int[] parts = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();

            infos.add(parts);
        }

        // 미지의 점은 이웃한 점의 연장선으로부터 수직으로 만난다.
        int[] xCoords = infos.stream().mapToInt(arr -> arr[0]).toArray();
        int[] yCoords = infos.stream().mapToInt(arr -> arr[1]).toArray();

        int x = findUnique(xCoords);
        int y = findUnique(yCoords);

        System.out.println(x + " " + y);
    }

    public static int findUnique(int[] arr) {
        return arr[0] ^ arr[1] ^ arr[2];
    }
}
