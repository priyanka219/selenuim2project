package demo;

public class human {
	
	String  color;//variables declared at the class level are called as feilds
	int age ;
	String gender;
	
	public human(String humancolour,int humanage,String humangender) {
		color = humancolour;
		age = humanage;
		gender = humangender;
		
	}
	 public human() {
	color = "broen";
	age = 23;
	gender = "female";
	}
	public void printdetails() {
		 System.out.println("color = " +color+  " age = " + age +  " gender = " + gender);
	 }
	
	public static void main(String[] args) {
		human john = new human("white",25,"male");
		human jaya = new human("black",23,"male");
		human kala = new human("brown",22,"female");
		human tim  = new human();
		human jim = new human();
		
		john.printdetails();
		jaya.printdetails();
		kala.printdetails();
		tim.printdetails();
		jim.printdetails();
		
		
	}

}
