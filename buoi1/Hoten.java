package buoi1;

import java.util.Scanner;

public class Hoten {
	public String tachten() {
		Scanner sc = new Scanner(System.in);
		String hoten = sc.nextLine();
		hoten.trim();
		int p = hoten.lastIndexOf(" ");
		String ten = hoten.substring(p+1);
		return ten;
	}
	public static void main(String args[]) {
		Hoten x = new Hoten();
		System.out.printf("%s", x.tachten());
	}
}
