import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int input = Integer.parseInt(br.readLine());

            int quarter = input / 25;
            input %= 25;

            int dime = input / 10;
            input %= 10;

            int nickel = input / 5;
            input %= 5;

            int penny = input / 1;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}
