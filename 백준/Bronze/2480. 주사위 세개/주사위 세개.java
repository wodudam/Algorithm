import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] splits = br.readLine().split(" ");

        int a = Integer.parseInt(splits[0]);
        int b = Integer.parseInt(splits[1]);
        int c = Integer.parseInt(splits[2]);

        if (a == b && b == c)
            System.out.println(10000 + (a * 1000));
        else if (a == b || a == c)
            System.out.println(1000 + (a * 100));
        else if (b == c)
            System.out.println(1000 + (b * 100));
        else
            System.out.println(Math.max(a, Math.max(b, c)) * 100);

    }
}
