package com.class_objects;
class  Animal{
	public void eat() {
		System.out.println("Animal Eating");
	}
}
class Dog extends Animal{
	@Override
	public void eat() {
		System.out.println(" Dog is Eating");
	}
	public void isWalking() {
		System.out.println("Dog is walking");
	}
	
}
public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Dog d1=new Dog();
       d1.eat();
       d1.isWalking();
	}

}
