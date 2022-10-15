package buoi3;

import java.util.Scanner;

import buoi2.Date;

public class SinhVien {
	private String MSSV, hoten;
	private Date ngSinh;
	private int soluong, max; //so luong hoc phan da dang ky
	private String tenHocPhan[] , diem[]; // ten cac hoc phan da dang ky
	
	public SinhVien() {
		MSSV = new String();
		hoten = new String();
		ngSinh = new Date();
		soluong = 0;
		max = 100;
		tenHocPhan = new String[max];
		diem = new String[max];
	}
	public SinhVien(String m, String h, Date n) {
		m = new String();
		h = new String();
		n = new Date();
	}
	
	public SinhVien(int max1) {
		MSSV = new String();
		hoten = new String();
		ngSinh = new Date();
		soluong = 0;
		max = max1;
		tenHocPhan = new String[max1];
		diem = new String[max1];
	}
	
	public SinhVien(SinhVien s) { 
		MSSV = new String(s.MSSV);
		hoten = new String(s.hoten);
		ngSinh = new Date(s.ngSinh);
		for(int i = 0; i < soluong; i++) {
			tenHocPhan[i] = new String(s.tenHocPhan[i]);
			diem[i] = new String(s.diem[i]);
		}
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap MSSV: ");
		MSSV = sc.nextLine();
		System.out.println("nhap ho ten: ");
		hoten = sc.nextLine();
		System.out.println("nhap ngay sinh:");
		ngSinh.nhap();
	}
	
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong hoc phan: ");
		soluong = sc.nextInt();
		String s = Integer.toString(soluong);
		s = sc.nextLine();
		for(int i = 0; i< soluong;i++) {
			System.out.println("nhap hoc phan thu "+(i+1)+": ");
			tenHocPhan[i] = sc.nextLine();
			System.out.println("nhap diem mon "+ tenHocPhan[i]+": ");
			diem[i] = sc.nextLine();
		}
	}
	
	public void in() {
		System.out.println("[" + MSSV + ", " + hoten + ", " + ngSinh + "]");
	}
	public void inDiem() {
		for(int i = 0; i< soluong ;i++)
			System.out.println("[" + tenHocPhan[i] + ", " + diem[i] +"]");
	}
	
	public String toString() {
		String S = "[" + MSSV + ", " + hoten + ", " + ngSinh;
		for(int i = 0; i< soluong ;i++) {
			S+= ", " + tenHocPhan[i] + ", " + diem[i] + "]";
		}
		return S;
	}
	
	public float dtb() { // diem trung binh
		float kq = 0.0f;
		for(int i = 0 ; i<soluong; i++){
			if(diem[i].compareTo("A")==0)
				kq += 4;
			else if(diem[i].compareTo("B+")==0)
				kq+=3.5;
			else if(diem[i].compareTo("B")==0)
				kq+=3;
			else if(diem[i].compareTo("C+")==0)
				kq+=2.5;
			else if(diem[i].compareTo("C")==0)
				kq+=2;
			else if(diem[i].compareTo("D+")==0)
				kq+=1.5;
			else if(diem[i].compareTo("D")==0)
				kq+=1;
			else if(diem[i].compareTo("F")==0)
				kq = 0;
		}
		return kq/soluong;
	}
	public void them(String mon, String d) {
		if(soluong < max -1) {
			tenHocPhan[max] = new String (mon);
			diem[max] = new String (d);
			soluong++;
		}
		else System.out.println("danh sach hoc phan day, khong the dang ky them !");
	}
	public void xoa(String mon) {
		int i;
		for( i = 0; i<soluong ;i++) {
			if(tenHocPhan[i].equals(mon))
				break;
		if(i<soluong) 
			for(int j = i ; j < soluong -1 ; j++) {
				tenHocPhan[j] = new String(tenHocPhan[j+1]);
				diem[j] = new String(diem[j+1]);
			}
		}
		soluong--;
	}
	
	public void dangKy() {
		Scanner sc = new Scanner(System.in);
		String tenHocPhan = " ";
		System.out.println("nhap cac mon can dang ky, dung lai bang lenh stop");
		do {
			System.out.println("nhap ten mon hoc: ");
			tenHocPhan = sc.nextLine();
			if(tenHocPhan.equals("stop"))
				break;
			them(tenHocPhan, " ");
		}while(true);
	}
	
}
