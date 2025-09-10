import java.io.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        int len =  input.length();
        int number = Integer.parseInt(input);

        for(int i = number - (len * 9); i < number; i++){
            int result = calculationSumOfDecomposition(i);
            if (result == number) {
                bw.write(String.valueOf(i));
                bw.flush();
                return;
            }
        }

        bw.write(String.valueOf(0));
        bw.flush();
    }

    public static int calculationSumOfDecomposition(int number) {
        int operand = number;
        int sum = 0;

        while(operand / 10 > 0){
            sum += operand % 10;
            operand /= 10;
        }

        sum += operand;
        return sum + number;
    }
}