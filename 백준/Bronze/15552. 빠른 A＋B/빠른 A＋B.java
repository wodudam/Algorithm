import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] splits = br.readLine().split(" ");
            int a = Integer.parseInt(splits[0]);
            int b = Integer.parseInt(splits[1]);
            bw.write((a + b) + "\n");
        }
        bw.flush();
        bw.close();

    }
}
