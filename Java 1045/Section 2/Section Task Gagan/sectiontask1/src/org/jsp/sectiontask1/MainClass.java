package org.jsp.sectiontask1;

public class MainClass {
	public static void HelperMethod(ImplementationClass ref) {
		ref.method1();
		ref.method2();
		ref.main("a");
		ref.main("a","b");
		ref.main("a","b","c");
		ref.main("a","b","c","d");
	}
	public static void main(String[] args) {
		ImplementationClass ref=new ImplementationClass();
		HelperMethod(ref);
	}
}
