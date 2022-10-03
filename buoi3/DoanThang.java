package buoi3;

import buoi2.Diem;

public class DoanThang {
	private Diem d1;
	private Diem d2;
	
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	
	public DoanThang(Diem d11, Diem d22){
		d1 = new Diem(d11);
		d2 = new Diem(d22);
	}
	public DoanThang(int ax, int ay, int bx, int by) {
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}
	
	public DoanThang(DoanThang dt) {
		d1 = new Diem(dt.d1);
		d2 = new Diem(dt.d2);
	}
	public void nhap() {
		System.out.println("nhap toa do d1: ");
		d1.nhap();
		System.out.println("nhap toa do d2: ");
		d2.nhap();
	}
	public void in() {
		System.out.println("(" + d1 + "," + d2 + ")");
	}
	public String toString() {
		return ("(" + d1 + "," + d2 + ")");
	}
	public void tinhTien(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	public float doDai() {
		return d1.khoangCach(d2);
	}
	public Diem trungDiem(){
//		Diem I = new Diem();
//		I.ganX((d1.giaTriX()+d2.giaTriX())/2); 
//		I.ganY((d1.giaTriY()+d2.giaTriY())/2);
		return new Diem(d1.giaTriX()+d2.giaTriX()/2, 
						(d1.giaTriY()+d2.giaTriY()/2));
	}
//	public double gocVoiTrucHoang() {
//		
//	}
}
