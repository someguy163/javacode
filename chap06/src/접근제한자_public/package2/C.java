package 접근제한자_public.package2;

import 접근제한자_public.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;   
		//a.field2 = 1;   
		//a.field3 = 1;   
		
		a.method1();   
		//a.method2();   
		//a.method3();   
	}
}


