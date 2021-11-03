package eaxple;
class A{  }
class B extends A{  }
class C extends A{  }
class D extends B{  }
class E extends C{  }
public class ProlyTest {
	B b = new B();C  c = new C();D  d = new D();E  e = new E();  
	
	A aa1 = new B();
	
	A a1 = b;	A a2 = c;	A a3 = d;	A a4 = e;
	
	B b1 = d;	C c1 = e;
	
	B b3 = (B)aa1;		D dd1 = (D)a3;
	

}
