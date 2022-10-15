package buoi2;

import java.util.Scanner;

public class Diem {
	private int x;
	private int y;
	
	
	public Diem() {
		x =0;
		y =0;
	}
	
	public Diem(int x1, int y1) {
		x = x1;
		y = y1;
	}
	
	public Diem(Diem d) {
		x = d.x;
		y = d.y;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap toa do x = ");
		x = sc.nextInt();
		System.out.println("Nhap toa do y = ");
		y = sc.nextInt();
	}
	
	public void in() {
		System.out.println("(" + x + "," + y + ")");
	}
	
	public String toString(){
		return ("(" + x + "," + y + ")");
	}
	
	public void doiDiem(int dx , int dy) {
		x += dx;
		y+= dy;
	}
	
	public float khoangCach() { // khoang cach(x,y) -> 0 : sqrt(x^2 + y^2)
		float kq = (float) Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2));
		return kq;
	}
	
	public float khoangCach(Diem B) { // khoang cach(x,y) -> B(x,y) : sqrt((x-B.x)^2 + (y-B.y)^2)
		return (float) Math.sqrt(Math.pow(x - B.x , 2)+ Math.pow(y - B.y, 2));	
	}
	
	public int giaTriX() {
		return x;
	}
	
	public int giaTriY() {
		return y;
	}
	public void ganX(int x1, int y1) {
		x = x1;
		y = y1;
	}
	public static void main(String[] args) {
		Diem A = new Diem(3,4);
		System.out.print("Toa do diem A: ");
		A.in();
		Diem B = new Diem();
		System.out.println("Nhap toa do diem B: ");
		B.nhap();
		System.out.print("Toa do diem B: ");
		B.in();
		
		Diem C = new Diem(-B.x, -B.y);
		System.out.print("Toa do diem C: ");
		C.in();
		
		System.out.println("Khoang cach tu B den O = "+ B.khoangCach());
		System.out.println("Khoang cach tu B den A = "+ B.khoangCach(A) );
		
		System.out.print("Tinh tien diem B den (3,7): ");
		B.doiDiem(3, 7);
		B.in();
		
		
	}
}
