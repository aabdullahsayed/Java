package bruh;
import java.util.Scanner;

public class bee {
		 
	    public static void main(String[] args) {
	 
	        Scanner uin = new Scanner(System.in);
	        
	        int a = uin.nextInt();
	        int b = uin.nextInt();
	        Double c = uin.nextDouble();
	        
	        System.out.println("NUMBER = "+a);
	        //System.out.print("SALARY = U$ "+ String.format("%.2f", (b*c)));
	        System.out.printf("SALARY = U$ %.2f", (b*c));
	        
	        uin.close();
	 
	}
}
