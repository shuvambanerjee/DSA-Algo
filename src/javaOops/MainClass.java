package javaOops;

public class MainClass {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.name = "Simba";
		a1.age = 4;
		System.out.println(a1.name+ " "+a1.age);

	}

}

class Animal{
	int age;
	String name;
}
