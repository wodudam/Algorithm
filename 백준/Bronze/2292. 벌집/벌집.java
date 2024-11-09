import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int layer = 1;
        int room = 1;

        if (N == 1) {
            System.out.println(1);
        } else {
            while (room < N) {
                room = room + (6 * layer);
                layer++;
            }
            System.out.println(layer);
        }
        
    }
}
