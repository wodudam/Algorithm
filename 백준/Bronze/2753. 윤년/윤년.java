import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int a = Integer.parseInt(s);

        //System.out.println(((a % 4 == 0) && (a % 100 != 0)) || (a %400 ==0) ? "1" : "0");
        
        if (((a % 4 == 0) && (a % 100 != 0)) || (a %400 ==0))
            System.out.println("1");
        else
            System.out.println("0");
    }
}
