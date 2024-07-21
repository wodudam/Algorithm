import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';

            if (arr[index] == -1) {
                arr[index] = i;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}

