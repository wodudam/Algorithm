import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[][] paper = new boolean[100][100];
        int count = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;
        int totalArea = 0;

        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            x = Integer.parseInt(input[0]);
            y = Integer.parseInt(input[1]);
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    paper[j][k] = true;
                }
            }
        }

        for (int i = 0; i < paper.length; i++) {
            for (int j = 0; j < paper.length; j++) {
                if (paper[i][j]) {
                    totalArea++;
                }
            }
        }

        bw.write(String.valueOf(totalArea));
        bw.flush();
        br.close();
        bw.close();
    }
}

