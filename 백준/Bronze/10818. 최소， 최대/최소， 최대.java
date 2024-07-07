import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i =0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = arr[0];
        int min = arr[0];

        for (int j =0; j < n; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        
        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}

