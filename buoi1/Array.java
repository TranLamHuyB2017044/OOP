package buoi1;

import java.util.Scanner;
public class Array {
	int a[];
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap so phan tu cua mang: ");
		int n = sc.nextInt();
		a = new int[n];
		System.out.println("nhap cac phan tu cho mang:");
		for(int i =0; i<n;i++) {
			System.out.printf("a[%d] = ", i);
			a[i] = sc.nextInt();
		}
	}
	public void in() {
		
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
	}
	public int tong() {
		int tong =0;
		for(int i :a) {
			tong+= i;
		}
		return tong;
	}
	public void sapxep() {
		for(int i = 0; i<a.length;i++)
			for(int j = i+1;j<a.length;j++)
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]= a[j];
					a[j]=temp;
				}
	}
	public static void main(String args[]) {
		Array d = new Array();
		d.nhap();
		System.out.println("day so ban dau: ");
		d.in();
		System.out.println("\ntong day so la: " + d.tong());
		d.sapxep();
		System.out.println("\nday so sau khi sap xep:");
		d.in();
	}
}