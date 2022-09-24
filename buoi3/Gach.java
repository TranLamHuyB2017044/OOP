package buoi3;

import java.util.Scanner;



public class Gach {
	private String maso, mau;
	private int soluong, dai, rong ;
	private long gia;
	public Gach() {
		maso = " ";
		mau = "";
		soluong = dai = rong = 1;
		gia = 10000;
		
	}
	public Gach(String maso1, String mau1, int soluong1, int dai1, int rong1, long gia1) {
		maso = maso1;
		mau = mau1;
		soluong = soluong1;
		dai = dai1;
		rong = rong1;
		gia = gia1;
		
				
	}
	public Gach(Gach G1) {
		maso = G1.maso;
		mau =G1.mau;
		soluong = G1.soluong;
		dai = G1.dai;
		rong = G1.rong;
		gia = G1.gia;
		
		
	}
	public void nhap() {
		Scanner sc = new Scanner (System.in);
		System.out.println("nhap maso: ");
		maso = sc.nextLine();
		System.out.println("nhap mau: ");
		mau = sc.nextLine();
		System.out.println("nhap so luong: ");
		soluong = sc.nextInt();
		System.out.println("nhap chieu dai: ");
		dai = sc.nextInt();
		System.out.println("nhap chieu rong: ");
		rong = sc.nextInt();
		System.out.println("nhap gia: ");
		gia = sc.nextLong();
	}
	public void in() {
		System.out.println("maso: " + maso);
		System.out.println("mau`:"+ mau);
		System.out.println("so luong" + soluong);
		System.out.println("chieu dai: " + dai+ " chieu rong: "+ rong);
		System.out.println("gia ban la:"+ gia);
	}
//	public String toString() {
//		return 
//	}
	public long giaBanLe() {
		return gia + gia*(20/100);
	}
	public int dienTich() {
		return dai*rong;
		
	}
	public float maxArea() {
		Gach G = new Gach();
		return G.rong*G.dai*G.soluong;
	}
	
	public long soLuongHop(int D, int N) {
		int S = D*N;
		int sohop = S/ dienTich();
		if(S/dienTich()>0) {
			sohop++;
		}
		return sohop;		
	}
	public long giaMetVuong() {
		return gia*dienTich();	
	}
	public void inGiaGach() {
		
		System.out.println( "maso: "+ maso +" gia: "+gia +"/cm2");
	}
	public long getGia() {
		return gia;
	}
	public long chiPhiLotNen(int D, int N) {
		return soLuongHop(D,N)*gia;
	}
	
	
}
