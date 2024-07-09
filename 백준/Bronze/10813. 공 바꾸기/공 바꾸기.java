import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int a = 0; a < M; a++) {
            inputs = br.readLine().split(" ");
            int i = Integer.parseInt(inputs[0]) - 1;
            int j = Integer.parseInt(inputs[1]) - 1;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }


    }
}

