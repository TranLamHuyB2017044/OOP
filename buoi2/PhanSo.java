package buoi2;

import java.util.Scanner;

public class PhanSo {
	private int tuso, mauso;
	public PhanSo(){
		tuso = 0;
		mauso = 1;
	}
	public PhanSo(int tuso1, int mauso1){
		tuso = tuso1;
		mauso = mauso1;
	}
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		while(true){
			try{
				System.out.println("nhap phan so");
				System.out.println("tu so:");
				tuso = sc.nextInt();
				System.out.println("mau so:");
				mauso = sc.nextInt();
				if(mauso!=0)
					break;
				else 
					System.out.println("Mau so bang 0 hay nhap lai:");
			}
			catch(Exception e){
				System.out.println("Mau so bang 0 hay nhap lai:");
			}
		}
	
	}
	public void in(){	
		if(tuso == 0)
			System.out.println("0");
		else if(mauso == 1)
			System.out.println(""+ tuso);
		else if(tuso%mauso == 0 || mauso == tuso)
			System.out.println(""+ tuso/mauso);
		else
			System.out.println(tuso+"/"+mauso);
	}
	public void nghichDao(){
		tuso = mauso;
		mauso = tuso;
	}
	public PhanSo giaTriNghichDao(){
		PhanSo a = new PhanSo();
		return a.giaTriNghichDao();
	}
	public double giaTriThuc(){
		return (double)tuso/mauso;
	}
	public boolean lonHon(PhanSo a){
		PhanSo b = new PhanSo();
		if(b.giaTriThuc()> a.giaTriThuc())
			return true;
		return false;
	}
	public PhanSo congPhanSo(PhanSo b){
		PhanSo kq = new PhanSo(tuso, mauso);
		if(kq.mauso!=b.mauso){
			kq.mauso = kq.mauso * b.mauso;
			kq.tuso = (kq.tuso*b.mauso)+(b.tuso+kq.mauso);
		}	
		kq.tuso = kq.tuso + b.tuso;
		return kq;
	}
	public PhanSo truPhanSo(PhanSo b){
		PhanSo kq = new PhanSo(tuso, mauso);
		if(kq.mauso!=b.mauso){
			kq.mauso = kq.mauso * b.mauso;
			kq.tuso = (kq.tuso*b.mauso)-(b.tuso+kq.mauso);
		}	
		kq.tuso = kq.tuso - b.tuso;
		return kq;
	}
	public PhanSo nhanPhanSo(PhanSo b){
		PhanSo kq = new PhanSo(tuso, mauso);
		kq.tuso = kq.tuso*b.tuso;
		kq.mauso = kq.mauso*b.mauso;
		return kq;
	}
	public PhanSo chiaPhanSo(PhanSo b){
		PhanSo kq = new PhanSo(tuso, mauso);
		kq.tuso = kq.tuso*b.mauso;
		kq.mauso = kq.mauso*b.tuso;
		return kq;
	}
	public PhanSo congSoNguyen(int a){
		PhanSo A = new PhanSo(a, 1);
		PhanSo kq = new PhanSo();
		if(A.mauso!=kq.mauso){
			kq.mauso = A.mauso * kq.mauso;
			kq.tuso = (A.tuso*kq.mauso)+(kq.tuso+A.mauso);
		}	
	
		kq.tuso = A.tuso + kq.tuso;
		return kq;
	}
	
	
}