package buoi3;

import java.util.Scanner;

public class SDGach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("nhap so luong hop gach");
//		int n = sc.nextInt();
//		Gach G[] = new Gach[n];
//		for(int i = 0; i<n;i++) {
//			G[i] = new Gach();
//			G[i].nhap();
//		}
//		for(int i = 0; i<n;i++)
//			G[i].in();
		
		
//		long min = G[0].giaMetVuong();
//		int vitri = 0;
//		for(int i = 0; i<n;i++) {
//			if(G[i].giaMetVuong() < min) {
//				min = G[i].giaMetVuong();
//				vitri = i;
//			}	
//		}
//		System.out.println("loai gach chi phi lot thap la:");
//		G[vitri].inGiaGach();
		
		Gach A = new Gach();
		A.nhap();
		System.out.println("so luong hop la: " +  A.soLuongHop(5, 20));
		System.out.println("so tien phai tra de lot gach la: " + A.chiPhiLotNen(5, 20));
		
		
	}	

}
