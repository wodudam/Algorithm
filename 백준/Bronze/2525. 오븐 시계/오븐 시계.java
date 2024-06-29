import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] splits = br.readLine().split(" ");

        int h = Integer.parseInt(splits[0]);
        int m = Integer.parseInt(splits[1]);
        int t = Integer.parseInt(br.readLine());

        if ((m + t) < 60)
            System.out.println(h + " " + (m + t));
        else
            if (h + ((m + t) / 60) >= 24)
                System.out.println((h + ((m + t) / 60) - 24) + " " + ((m + t) % 60));
            else
                System.out.println((h + ((m + t) / 60)) + " " + ((m + t) % 60));
    }
}
