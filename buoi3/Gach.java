package buoi3;

import java.util.Scanner;



public class Gach {
	private String maso, mau;
	private int soluong, dai, ngang ;
	private long gia;
	public Gach() {
		maso = new String();
		mau = new String();
		soluong = dai = ngang = 0;
		gia = 0;
		
	}
	public Gach(String maso1, String mau1, int soluong1, int dai1, int ngang1, long gia1) {
		maso = maso1;
		mau = mau1;
		soluong = soluong1;
		dai = dai1;
		ngang = ngang1;
		gia = gia1;
		
				
	}
	public Gach(Gach G1) {
		maso = G1.maso;
		mau =G1.mau;
		soluong = G1.soluong;
		dai = G1.dai;
		ngang = G1.ngang;
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
		System.out.println("nhap chieu ngang: ");
		ngang = sc.nextInt();
		System.out.println("nhap gia: ");
		gia = sc.nextLong();
	}
	public void in() {
		System.out.println("maso: " + maso);
		System.out.println("mau`:"+ mau);
		System.out.println("so luong" + soluong);
		System.out.println("chieu dai: " + dai+ " chieu ngang: "+ ngang);
		System.out.println("gia ban la:"+ gia);
	}
//	public String toString() {
//		return 
//	}
	public long giaBanLe() {
		return gia + gia*(20/100);
	}
	public int dienTich() {
		return dai*ngang;
		
	}
	public float maxArea() {
		Gach G = new Gach();
		return G.ngang*G.dai*G.soluong;
	}
	
	public int soLuongHop(int D, int N) {
		int slvD = D /dai;
		if(D%dai !=0)
			slvD++;
		int slvN = N/ngang;
		if(N%ngang !=0)
			slvN++;
		int tongVien = slvN*slvD; 	
		int sohop = tongVien/soluong;
		if(tongVien%soluong!=0)
			sohop++;
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
