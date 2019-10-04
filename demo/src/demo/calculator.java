package demo;

public class calculator {

	public int add(int a,int b) {
	return (a+b);
	}
	public void sub(int a,int b) {
		System.out.println(a-b);
	}
	public void mult(int a,int b) {
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		calculator basiccal = new calculator();
		System.out.println(basiccal.add(12,12));
		basiccal.mult(12, 23);
		basiccal.sub(23,12);
	}
}
