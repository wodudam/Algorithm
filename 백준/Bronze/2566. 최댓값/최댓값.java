import java.io.*;

public class Main {
    public static final int ROW = 9;
    public static final int COL = 9;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] matrix = new int[ROW][COL];
        int max = 0;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < ROW; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < COL; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
                if (max <= matrix[i][j]) {
                    max = matrix[i][j];
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }
        
        bw.write(max + "\n");
        bw.write(maxRow + " " + maxCol);
        bw.flush();
        br.close();
        bw.close();
    }
}

