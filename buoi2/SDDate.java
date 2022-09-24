package buoi2;

public class SDDate {

	public static void main(String[] args) {
		Date d = new Date(13,9,2022);
		System.out.println("       Carlendar");
		System.out.print("Today ");
		d.in();
		Date d2 = new Date();
		d2.nhap();
		d2.in();
		System.out.print("Next 20 year when i was born:");
			d2 = d2.cong(7200);
			d2.in();

	}

}