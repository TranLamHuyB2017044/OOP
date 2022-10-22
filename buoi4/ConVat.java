package buoi4;

import java.util.Scanner;

public abstract class ConVat {
	private String maulong, giong;
	private float cannang;
	public abstract void Keu();
	
	public ConVat() {
		maulong = new String();
		giong = new String();
		cannang = 0.0f;
	}
	public ConVat(String maulong1, String giong1, float cannang1) {
		maulong = new String(maulong1);
		giong = new String(giong1);
		cannang = cannang1;
	}
	
	public ConVat(ConVat a) {
		maulong = new String(a.maulong);
		giong = new String(a.giong);
		cannang = a.cannang;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin con vat");
		System.out.println("Nhap giong loai: ");
		giong = sc.nextLine();
		System.out.println("Nhap mau long: ");
		maulong = sc.nextLine();
		System.out.println("Nhap can nang: ");
		cannang = sc.nextFloat();
	}
	
	public void in() {
		System.out.println("Thong tin con vat");
		System.out.println("[Giong loai: "+ giong + ", Mau long: " + maulong + ", Can nang: " + cannang + "]");
	}

	public void sa() {
		System.out.println("Thong tin con vat");
		System.out.println("[Giong loai: "+ giong + ", Mau long: " + maulong + ", Can nang: " + cannang + "]");
	}
	 
	
}
