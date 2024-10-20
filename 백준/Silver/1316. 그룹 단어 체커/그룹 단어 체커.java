import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isGroupWord(String word) {
        boolean[] alphabet = new boolean[26];
        char prev = 0;

        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);

            if (current != prev && alphabet[current - 'a']) {
                return false;
            }
            
            alphabet[current - 'a'] = true;
            prev = current;
        }

        return true;
    }
}
