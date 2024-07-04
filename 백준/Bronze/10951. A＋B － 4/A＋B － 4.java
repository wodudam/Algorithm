import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        String str;

        try {
            while ((str = br.readLine()) != null) {
                String[] splits = str.split(" ");
                int a = Integer.parseInt(splits[0]);
                int b = Integer.parseInt(splits[1]);
                int sum = a + b;

                bw.write(sum + "\n");
            }
            bw.close();

        } catch (IOException e) {
            throw new IOException();
        }

    }
}
