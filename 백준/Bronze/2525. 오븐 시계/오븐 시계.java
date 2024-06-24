import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);
		        
				int a = sc.nextInt();
				int b = sc.nextInt();
		        int c = sc.nextInt();
		         
		        int result = a*60 + b + c;
		        int h = (result/60)%24;
		        int m = result%60;
		       
		        System.out.println(h + " " + m);        
	}
}