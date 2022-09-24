package buoi2;

public class SDDiem {
	public static void main(String[] args) {
		Diem A = new Diem(3,4);
		System.out.print("Toa do diem A: ");
		A.in();
		Diem B = new Diem();
		System.out.println("Nhap toa do diem B: ");
		B.nhap();
		System.out.print("Toa do diem B: ");
		B.in();
		
		Diem C = new Diem(-B.giaTriX(), -B.giaTriY()); // vi pham tinh bao goi
		System.out.print("Toa do diem C: ");
		C.in();
		
		System.out.println("Khoang cach tu B den O = "+ B.khoangCach());
		System.out.println("Khoang cach tu B den A = "+ B.khoangCach(A) );
		
		System.out.print("Tinh tien diem B den (3,7): ");
		B.doiDiem(3, 7);
		B.in();
		
		
	}
}
