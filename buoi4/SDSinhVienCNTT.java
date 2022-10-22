package buoi4;
import java.util.Scanner;

import buoi3.SinhVien;

public class SDSinhVienCNTT {

	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		SinhVienCNTT s = new SinhVienCNTT();
//		s.nhap();
//		s.in();
//		s.doiMatKhau();
//		s.layMK();
		SinhVien a[] ;
		System.out.println("Nhap so luong sinh vien:");
		int n = sc.nextInt();
		a = new SinhVien[n];
//		for(int i = 0; i < n; i++) {
//			a[i] = new SinhVienCNTT();
//		}
//		for(int i = 0; i < n; i++) {
//			 System.out.println("Nhap sinh vien thu" + (i +1) + ": ");
//				a[i].nhap();
//				a[i].nhapDiem();
//		}
//		String email;
//		email = sc.nextLine();
//		System.out.println("Nhap dia chi email:");
//		email = sc.nextLine();
//		boolean flag = false;
//		for(int i = 0; i < n; i++) {
//			if(a[i].getEmail().compareToIgnoreCase(email)==0) {
//				System.out.println("Thong tin tai khoan sinh vien vua tim thay: " + a[i].getTaiKhoan());
//				System.out.println("Diem trung binh cua sinh vien: " + a[i].dtb());
//				flag= true;
//			}
//		}
//		if(flag == false ) System.out.println("Khong tim thay tai khoan sinh vien nay !!!");
		int c;
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap phim 0 de nhap thong tin sinh vien CNTT, 1 de nhap thong tin sinh vien bat ky !!! ");
			 c = sc.nextInt();
			if (c == 0) 
				a[i]= new SinhVienCNTT();
			else  
				a[i]= new SinhVien();
			a[i].nhap();

		}
		for(int i = 0; i < n; i++) {
			System.out.println("--------------------------------");
			a[i].in();
	
		}
		
	}

}
