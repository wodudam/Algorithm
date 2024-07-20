import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[31];

        for (int i = 1; i <= 28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n]++;
        }

        for (int j = 1; j <= 30; j++) {
            if (arr[j] == 0) {
                System.out.println(j);
            }
        }
    }
}

