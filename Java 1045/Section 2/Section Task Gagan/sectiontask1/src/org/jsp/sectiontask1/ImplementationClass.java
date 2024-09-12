package org.jsp.sectiontask1;

public class ImplementationClass implements IncompleteClass {
	public ImplementationClass()
	{
		System.out.println("Task starts now");
	}
	@Override
	public void method1() {
		System.out.println("I am in method 1 block");
	}
	@Override
	public void method2() {
		System.out.println("I am in method 2 block");
	}
	public static void main(String a) {
		System.out.println("I am in main method block 1");
	}
	public static void main(String a,String b) {
		System.out.println("I am in main method block 2");
	}
	public static void main(String a,String b,String c) {
		System.out.println("I am in main method block 3");
	}
	public static void main(String a,String b,String c,String d) {
		System.out.println("I am in main method block 4");
	}
}
