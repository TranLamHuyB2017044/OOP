package buoi4;
import java.util.Scanner;

import buoi2.Diem;
public class DiemM extends Diem{
	private String mau;
	
	
	public DiemM() {
		super();
		mau = new String();	
	}
	public DiemM(int x, int y, String m) {
		super(x, y);
		mau = new String(m);
	}
	
	public DiemM(DiemM dmau) { // dmau co toa do (x,y, mau)
		super(dmau);
		mau = new String(dmau.mau);	
	}
	
	public void ganMau(String mau) {
		this.mau = new String(mau);
	}
	
	public void nhap() { // nap de 
		Scanner sc = new Scanner (System.in);
		super.nhap();
		System.out.println("nhap mau cho diem: ");
		mau = sc.nextLine();
	}
	
	public void in() {
		super.in();
		System.out.println("diem co mau:  " + mau);
	}
	public String toString() {
		return super.toString()+ "diem co mau: " + mau;
	}
}
