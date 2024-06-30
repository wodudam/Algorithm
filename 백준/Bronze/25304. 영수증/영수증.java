import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalPrice = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        int price = 0;

        for (int i = 0; i < count; i++) {
            String[] splits = br.readLine().split(" ");
            int a = Integer.parseInt(splits[0]);
            int b = Integer.parseInt(splits[1]);
            price = price + (a * b);
        }

        if (totalPrice == price)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
