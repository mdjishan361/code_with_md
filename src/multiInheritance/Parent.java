package multiInheritance;

public class Parent {
	
	public void m1()  {
		System.out.println("m1 method of Parent class");
	}
	
	public static void main(String[] args) {
		
		Child1 c1=new Child1();
		c1.m1();
		c1.m2();
		
	}

}
