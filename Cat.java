package kr.hs.dgsw.java.first;

public class Cat {
	int age;
	String name;
	int height;
	
	void bark() {
		System.out.println("야옹");
	}
	
	int getProperty(String a) {
		if(a == "age") {
			return this.age;
		}
		else {
			return this.height;
		}
	}
	
	void addAge() {
		this.age += 1;
	}
	
}
