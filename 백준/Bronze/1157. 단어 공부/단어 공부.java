import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();

        int count[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'A';
            count[num]++;
        }

        int max = 0;
        char answer = '?';

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                answer = (char)(i + 'A');
            }
            else if (count[i] == max) {
                answer = '?';
            }
        }

        System.out.println(answer);
    }
}
