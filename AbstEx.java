package eaxple;
abstract class Abc{
	int a;
	void def()	{
		System.out.println("������ ���");
	}
	abstract void sound();
}

class Def extends Abc{
	void sound() {
		
	}
}
public abstract class AbstEx {
	public static void main(String[] args) {
		//Abc a = new Abc();
		Def d = new Def();
	}

}
