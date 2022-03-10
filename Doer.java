package kr.hs.dgsw.java.first;

public class Doer {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.age = 2;
		cat.name = "abc";
		cat.height = 20;
		
		cat.bark();
		cat.addAge();
	
		int i =  cat.getProperty("age");
		System.out.println(i);
		
		Rectangle Rect = new Rectangle();
		Rect.height = 10;
		Rect.width = 8;
		System.out.println(Rect.measureArea());
	}
}
