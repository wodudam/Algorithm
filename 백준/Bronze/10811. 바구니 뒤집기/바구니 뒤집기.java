import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] splits = br.readLine().split(" ");
        int N = Integer.parseInt(splits[0]);
        int M = Integer.parseInt(splits[1]);

        int[] arr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        for (int j = 0; j < M; j++) {
            splits = br.readLine().split(" ");
            int I = Integer.parseInt(splits[0]);
            int J = Integer.parseInt(splits[1]);

            while (I < J) {
                int tmp = arr[I];
                arr[I++] = arr[J];
                arr[J--] = tmp;
            }
        }

        for (int k = 1; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}

