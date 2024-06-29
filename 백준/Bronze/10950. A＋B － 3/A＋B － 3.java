import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] splits = br.readLine().split(" ");
            int a = Integer.parseInt(splits[0]);
            int b = Integer.parseInt(splits[1]);

            int result = a + b;
           // bw.write(result);
            System.out.println(result);
        }
       // bw.flush();
       // bw.close();
    }
}
