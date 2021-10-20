package pack2;

import pack1.OneOne;

public class TwoTwo {
	public static void main(String[] args) {
		TwoOne bb = new TwoOne();
		//bbb.b;    b가 private 이기 때문에 접근 불가능
		bbb.bb = 6;
		bbb.print();
		OneOne baa = new OneOne();
		//baa.a; a가 private 이기 때문에 접근 불가능 
		//baa.aa; aa가 default이기 때문에 접근 불가능
		//baa.aaa; aaa가 protected 이지만 상속관계가 아니기 때문에 접근 불가능
		//baa.aaaa = 6;
	}

}
