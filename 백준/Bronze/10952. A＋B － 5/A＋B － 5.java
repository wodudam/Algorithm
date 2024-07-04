import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int sum = 0;

        while (true) {
            String[] splits = br.readLine().split(" ");
            int a = Integer.parseInt(splits[0]);
            int b = Integer.parseInt(splits[1]);
            sum = a + b;

            if (sum == 0 && a == 0 && b == 0) {
                break;
            }
            
            bw.write(sum + "\n");
        }

        bw.flush();
        bw.close();
    }
}
