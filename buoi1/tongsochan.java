package buoi1;

public class tongsochan {
	public int tong(int a, int b) {
		int tong = 0;
		for(int i=a;i<=b;i++)
			if(i%2==0) {
				tong+=i;
			}
		return tong;
	}
	public static void main(String args[]) {
		tongsochan t = new tongsochan();
		System.out.println(" " +t.tong(1, 10));
	}
}
