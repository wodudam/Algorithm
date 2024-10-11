import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] chess = {1, 1, 2, 2, 2, 8};

        String[] s = br.readLine().split(" ");

        for (int i = 0; i < s.length; i++) {
            sb.append(chess[i] - Integer.parseInt(s[i])).append(" ");
        }

        System.out.println(sb.toString());
    }
}
