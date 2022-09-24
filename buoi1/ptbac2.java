package buoi1;
import java.util.Scanner;


public class ptbac2 {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int a,b,c,delta; 
		a = kb.nextInt();
		b = kb.nextInt();
		c = kb.nextInt();
		delta = (b*b) - 4*a*c;
		if(delta > 0) {
			double x1 = (-b + Math.sqrt(delta))/(2*a*1.0);
			double x2 = (-b - Math.sqrt(delta))/(2*a*1.0);
			System.out.printf(" x1 = %.2f\n", +x1);
			System.out.printf(" x2 = %.2f\n", +x2);
		}
		else if(delta < 0) {
			if(a==0) {
				if(b==0)
					System.out.println("Phuong trinh vo so nghiem");	
			}
			else System.out.println("Phuong trinh vo nghiem");
		}
		else {
			System.out.printf("Phuong trinh co nghiem kep x = %.2f", + ((float)-b/2*a));
			
		}
	}
}
