package demo;

public class Methodoverloadingbyss {
	
	
	
	public void print(String name)
	{
		System.out.println("me name is " +name);
	}
	public void print(int age)
	{
		System.out.println("me age is " +age);
	}
	public static void main(String[] args) {
		Methodoverloadingbyss laserjet = new Methodoverloadingbyss();
		laserjet.print("priyanka");
		laserjet.print(23);
		
		
	}
	
		
	}


