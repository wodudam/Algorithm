import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] splits = str.split(" ");

        long a = Long.parseLong(splits[0]);
        long b = Long.parseLong(splits[1]);
        long c = Long.parseLong(splits[2]);

        System.out.println(a + b + c);
    }
}
