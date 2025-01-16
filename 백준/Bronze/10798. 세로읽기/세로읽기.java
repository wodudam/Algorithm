import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] matrix = new char[5][15];

        for (int row = 0; row < 5; row++) {
            String word = br.readLine();
            for (int col = 0; col < word.length(); col++) {
                matrix[row][col] = word.charAt(col);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int col = 0; col < 15; col++) {
            for (int row = 0; row < 5; row++) {
                if (matrix[row][col] != '\0') {
                    sb.append(matrix[row][col]);
                }
            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}

