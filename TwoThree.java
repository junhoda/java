package pack2;

import pack1.OneOne;

public class TwoThree extends OneOne{
	int bbb;
	public static void main(String[] args) {
		OneOne bbaa = new OneOne();
		//bbaa.a; private
		//bbb.aa; default
		//bbaa.aaa = 5; protected
		bbaa.aaaa = 6;		//public
		
		TwoThree bbaaa = new TwoThree();
		//bbaaa.a = 1; private
		//bbaaa.aaa = 1; default
		bba.aaa = 6;
		bbaa.aaaa = 6;
		
	}

}
