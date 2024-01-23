package 추상;

public class AnimalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();		
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-------------");
		Animal catAnimal = new Cat();
		Animal dogAnimal = new Dog();
		
		
		dogAnimal.sound();
		catAnimal.sound();
		
		System.out.println("-------------");
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
abstract class Animal{
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	public abstract void sound();
}
class Cat extends Animal{

	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
class Dog extends Animal{

	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
	
}
