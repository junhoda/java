package pack1;

public class OneOneTest {
	public static void main(String[] args) {
		OneOne all = new OneOne();
		//all a;
		all.aa = 6;		//aa는 OneOne 클래스에서 default로 선언했기 때문에 접근 가능 
		all.print();    //default라서 메소드 호출이 가능
	}

}
