package buoi3;

import buoi2.Diem;

public class SDDoanThang {
	public static void main(String[] args){
//		Diem A = new Diem (2, 5);
//		Diem B = new Diem (20, 35);
//		DoanThang AB = new DoanThang(A, B);
//		AB.tinhTien(5, 3);
//		AB.in();
		DoanThang CD = new DoanThang();
		CD.nhap();
		System.out.println("Do dai doan thang CD la: " + CD.doDai());
	}
}
