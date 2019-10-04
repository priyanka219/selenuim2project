package demo;

public class Calcu {
	//this is our 1 method which we created
public int add(int a,int b) {
	return(a+b);//
}
//this is our 2 method which we created
public void sub(int a,int b) {
	System.out.println(a-b);
	
}
public void human(String name,int age,String gender) {
	System.out.println("name = " + name +   "age =" + age +   "gender =" +gender);
}
public static void main(String[] args) {
	Calcu ram = new Calcu();
Calcu sita = new Calcu();
Calcu geeta = new Calcu();
System.out.println(ram.add(10, 20));     //we use obj.method
sita.sub(30, 40);
geeta.sub(50,10);
geeta.human("preeth", 16, "female");
	
	
}

}
