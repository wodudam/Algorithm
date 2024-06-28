import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int a = Integer.parseInt(s);
        
        if (a>=90 && a<=100)
            System.out.println("A");
        else if (a>=80 && a<90)
            System.out.println("B");
        else if (a>=70 && a<80)
            System.out.println("C");
        else if (a>=60 && a<70)
            System.out.println("D");
        else 
            System.out.println("F");
    }
}
