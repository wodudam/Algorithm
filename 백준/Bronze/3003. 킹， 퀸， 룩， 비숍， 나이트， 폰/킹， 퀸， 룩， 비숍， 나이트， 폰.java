import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] chess = {1, 1, 2, 2, 2, 8};

        String[] s = br.readLine().split(" ");

        for (int i = 0; i < s.length; i++) {
            bw.write(chess[i] - Integer.parseInt(s[i]) + " ");
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
