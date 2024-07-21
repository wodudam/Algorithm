import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] splits = br.readLine().split(" ");

        double[] arr = new double[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(splits[i]);
        }

        double M = 0;
        double sum = 0;
        double avg;

        for (int j = 0; j < N; j++) {
            if (arr[j] > M)
                M = arr[j];
        }

        for (int k = 0; k < N; k++) {
            arr[k] = (arr[k] * 100) / M;
            sum = sum + arr[k];
        }

        avg = sum / N;
        System.out.println(avg);
    }
}

