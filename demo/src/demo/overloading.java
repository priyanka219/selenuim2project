package demo;

public class overloading {

	public void add(int a,int b) {
	System.out.println(a+b);
	
	}
	public void add(double a,double b)
	{
		System.out.println(a+b);
	}
	public int add(int a,int b,int c) {
	return(a+b+c);
	}
	public static void main(String[] args) {
		overloading addition = new overloading();//creating a new object
		addition.add(13, 23);//obj.method
		addition.add(12.2, 13.3);
		System.out.println(addition.add(10,34,25));
		
		
	}
	
	
}
