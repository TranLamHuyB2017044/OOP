package buoi4;
import java.util.Scanner;

import buoi3.SinhVien;

public class SDSinhVienCNTT {

	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		SinhVienCNTT s = new SinhVienCNTT();
		s.nhap();
		s.in();
		s.doiMatKhau();
//		s.layMK();
		System.out.println("Nhap so luong sinh vien:");
		int n = sc.nextInt();
		SinhVienCNTT a[] = new SinhVienCNTT[n];
		for(int i = 0; i < n; i++) {
			 a[i] = new SinhVienCNTT();
			 System.out.println("Nhap sinh vien thu" + (i +1) + ": ");
				a[i].nhap();
		}
		
		
	}

}
