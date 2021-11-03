package eaxple;
interface Inter1{
	void abc();
	void def();
}
interface Inter2{
	void abc1();
	void def2();
}

class GHI implements Inter1,Inter2 {

	public void abc1() {System.out.println("¸Þ¼Òµå1");	}
	public void def2() {}
	public void abc() {}
	public void def() {}
	
}
public class InterExam {
	GHI g = new GHI();

}
