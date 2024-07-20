import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] splits = br.readLine().split(" ");
        int N = Integer.parseInt(splits[0]);
        int M = Integer.parseInt(splits[1]);

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int j = 1; j <= M; j++) {
            splits = br.readLine().split(" ");
            int I = Integer.parseInt(splits[0]) - 1;
            int J = Integer.parseInt(splits[1]) - 1;

            while (I < J) {
                int tmp = arr[I];
                arr[I++] = arr[J];
                arr[J--] = tmp;
            }
        }

        for (int k : arr)
            System.out.print(k + " ");
    }
}

