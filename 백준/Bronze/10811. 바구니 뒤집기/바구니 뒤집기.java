import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] splits = br.readLine().split(" ");
        int N = Integer.parseInt(splits[0]);
        int M = Integer.parseInt(splits[1]);

        int[] arr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        for (int j = 0; j < M; j++) {
            splits = br.readLine().split(" ");
            int a = Integer.parseInt(splits[0]);
            int b = Integer.parseInt(splits[1]);

            while (a < b) {
                int tmp = arr[a];
                arr[a] = arr[b];
                arr[b] = tmp;
                a++;
                b--;
            }
        }

        for (int k = 1; k < arr.length; k++) {
            bw.write(arr[k] + " ");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}

