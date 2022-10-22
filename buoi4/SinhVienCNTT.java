package buoi4;
import java.util.Scanner;
import buoi3.SinhVien;
import buoi2.Date;
public class SinhVienCNTT extends SinhVien{
	private String taikhoan, matkhau, email;
	
	public SinhVienCNTT() {
		super();
		taikhoan = new String();
		matkhau = new String();
		email = new String();
	}
	
	public SinhVienCNTT(String m, String h, Date n, String tk, String mk, String eml) {
		super(m, h, n);
		taikhoan = new String();
		matkhau = new String();
		email = new String();
	}
	
	public SinhVienCNTT(SinhVienCNTT s1) {
		super(s1);
		taikhoan = new String(s1.taikhoan);
		matkhau = new String(s1.matkhau);
		email = new String(s1.email);
	}
	
	public void nhap() { //nap de
		Scanner sc = new Scanner (System.in);
		super.nhap();
		System.out.println("Email id: ");
		email = sc.nextLine();
		System.out.println("User name: ");
		taikhoan = sc.nextLine();
		System.out.println("Password: ");
		matkhau = sc.nextLine();
		
	}
	
	
	public void in() {
		super.in();
		System.out.println("[ Email id: " + email + ", " 
		+ "User name: "+ taikhoan+ ", " 
				+ "Password: ******** ]" );
		
	}
	
	public void getMK() {
		System.out.println(matkhau);
	}
	public String toString() {
		return super.toString() + "Email id: " + email;
	}
	
	public void doiMatKhau() {
		Scanner sc = new Scanner (System.in);
		String p = new String();
		System.out.println("Current password: ");
		p = sc.nextLine();
		System.out.println("New password: ");
		p = sc.nextLine();
		System.out.println("Confirm new password: ");
		p = sc.nextLine();
		System.out.println("Change password success !!!");
		matkhau = new String(p);
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getTaiKhoan() {
		return taikhoan;
	}
	
	
	
}
