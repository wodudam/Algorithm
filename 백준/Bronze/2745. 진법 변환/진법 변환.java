import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        String B = input[0]; //진법
        int N = Integer.parseInt(input[1]); //수

        int output = Integer.parseInt(B, N);
        System.out.println(output);
    }
}
