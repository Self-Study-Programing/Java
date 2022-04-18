package kr.hs.dgsw.ex1;
import java.util.Scanner;

public class Dog {
//	private final String name;
//	private int age;
//	
//	public Dog() {
//		this("몰라");
//	}
//	
//	public Dog(String name) {
//		System.out.println("생성자 호출됨");
//		this.name = name;
//	}
//
//	public void sayHello() {
//		System.out.println("Hello " + this.name);
//	}
//	
//	public static void main(String[] args) {
//		System.out.println("count : " + args.length);
//		for(int i = 0; i< args.length; i++) {
//			Dog dog = new Dog(args[i]);
//			dog.sayHello();
//		}
////		Dog puppy = new Dog("퍼피");
////		Dog happy = new Dog("해피");
////		Dog poppy = new Dog("뽀삐");
//	}
	String name;
	
	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}
	
	public Dog(String name) {
		this.name = name;
		sayHello(name);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("강아지 이름을 입력하세요. ");
			String name = scanner.next();
			if(name.equals("quit")) {
				break;
			}
			Dog dog = new Dog(name);
		}
	}
}
