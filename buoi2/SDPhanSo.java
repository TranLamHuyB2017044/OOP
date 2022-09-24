package buoi2;

import java.util.Scanner;

public class SDPhanSo {

	public static void main(String[] args) {
//		PhanSo a = new PhanSo(3,7);
//		a.in();
//		PhanSo b = new PhanSo(4,9);
//		b.in();
//		PhanSo x = new PhanSo();
//		PhanSo y = new PhanSo();
//		PhanSo z = new PhanSo();
//		x.nhap();
//		y.nhap();
//		z = x.congPhanSo(y);
//		z.in();
//		PhanSo temp = new PhanSo();
//		temp = x.giaTriNghichDao();
//		temp.in();
//		x = temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap gia tri n: ");
		int n = sc.nextInt();
		PhanSo []A = new PhanSo[n];
		for(int i = 0 ; i<n;i++){
			A[i] = new PhanSo();
			A[i].nhap();	
			
		}
		double max = A[0].giaTriThuc();
		int vitri = 0;
		for(int i = 1 ; i<n;i++) {
			if(A[i].giaTriThuc() > max) {
				max = A[i].giaTriThuc();
				vitri = i;
			}
		}
		System.out.println("phan so lon nhat la: " +vitri);
		A[vitri].in();
		for(int i = 0 ; i < n-1;i++) {
			for(int j = i+1 ; j < n;j++) {
				if(A[i].lonHon(A[j])) {
					PhanSo temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}	
			}
		}
		for(int i = 0 ; i<n;i++){
			A[i].in();
		}
	}

}