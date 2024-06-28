import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] splits = br.readLine().split(" ");

        int h = Integer.parseInt(splits[0]);
        int m = Integer.parseInt(splits[1]);

        if (m >= 45)
            System.out.println(h + " " + (m - 45));
        else {
            if (h > 0)
                System.out.println((h - 1) + " " + (m + 15));
            else
                System.out.println((h + 23) + " " + (m + 15));
        }
        
    }
}
