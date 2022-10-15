package buoi4;
import buoi2.Diem;
public class SDDiemM extends Diem{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DiemM A = new DiemM(5, 10, "trang");
//		A.in();
//		System.out.println(A);
		
		DiemM B = new DiemM();
		B.nhap();
		System.out.println("toa do Diem B la "+ B);
		B.doiDiem(10, 8);
		B.in();
		B.ganMau("Vang");
		B.in();
		
	}

}
