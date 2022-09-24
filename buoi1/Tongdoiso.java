package buoi1;
public class Tongdoiso {
	public static void main(String args[]) {
		double tong = 0,d =0;
		double max=Double.MIN_VALUE;
		for(String s : args) {
			try {
				 d = Double.parseDouble(s);
			}
			catch(Exception e) {
				d = 0.0;
			}
			if(max<d) {
				max = d;
				tong+=d;
			}
			
		}
		System.out.println("tong = :" +tong);
		System.out.println("so lon nhat = :" +max);
	}
}
