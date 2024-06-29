import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());

        for (int j = 1; j <= 9; j++) {
            bw.write(i + " * " + j + " = " + i * j + "\n");
        }
        bw.flush();
        bw.close();
    }
}
