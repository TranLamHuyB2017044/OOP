package buoi3;
import java.util.Scanner;

import buoi2.Date;
import buoi2.Diem;

public class SDSinhVien {
	public static void main(String agrs[]) {
//		SinhVien a = new SinhVien();
//		a.nhap();
//		a.in();		
		Scanner sc = new Scanner (System.in);
		System.out.println("So luong sinh vien can nhap:");
		int n = sc.nextInt();
		SinhVien s[] = new SinhVien[n];
		for(int i = 0; i< n ; i++) {
			s[i] = new SinhVien();
			System.out.println("Nhap sinh vien thu" + (i +1) + ": ");
			s[i].nhap();
		}
		
		for(int i = 0; i< n ; i++) {
			System.out.println("Nhap mon hoc sinh vien thu" + (i +1) + ": ");
			s[i].nhapDiem();
		}
		System.out.println("------------Danh Sach Sinh Vien----------");
		for(int i = 0; i< n ; i++) {			
			s[i].in();
			s[i].inDiem();
		}
//		System.out.println("|-------------------------------------------|");
//		System.out.println("   Danh Sach Sinh Vien bi canh cao hoc vu");
//		System.out.println("|-------------------------------------------|");
//		for(int i = 0; i< n ; i++) {			
//			if(s[i].dtb()<1 ) {	
//				s[i].in();
//			}
//		}
		
		
		
	}
}
