package rabi;

class Parent {
	void peoprty() {
		System.out.println("Property");
	}
	void marry() {
		System.out.println("famaily selection");
	}
}
public class Demo extends Parent {
	void marry() {
		System.out.println(" campus selection");
	}
	public static void main(String[] args) {
		Demo bb = new Demo();
    bb.marry();
    bb.peoprty();
    
	}
}

