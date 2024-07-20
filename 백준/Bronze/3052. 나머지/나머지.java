import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = a % 42;
            arr[b]++;
        }

        for (int j : arr) {
            if (j > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

