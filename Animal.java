package eaxple;

class Animal {
	public void Sound()	{System.out.println("������ �Ҹ��� ���ϴ�.");		}
	public void move()	{ System.out.println("�����Դϴ�.");			}
}


class Dog extends Animal{
	public void Sound()	{	
		System.out.println("�۸�.");
	
}
	}
class Cat extends Animal{
	public void Sound()	{	
		System.out.println("�߿˾߿�.");
	
}
	}
public class Pqr {
	public static void main(String[] args) {
		Animal a = new Dog();
		Animal b = new Cat();
		a.Sound();
		a.Sound();
		
		
	}

}


public class Animal {

}
