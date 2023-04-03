import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 상단 삼각형 출력
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                sb.append(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        // 하단 삼각형 출력
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n - i; j > 0; j--) {
                sb.append(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
