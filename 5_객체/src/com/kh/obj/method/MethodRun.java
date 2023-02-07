package com.kh.obj.method;

public class MethodRun {

	public static void main(String[] args) {
		/*
		MethodTest mt = new MethodTest();
		
		mt.test1();
		 */
		
		A_NonStatic m1 = new A_NonStatic();
		
		// m1.test1();
		// String result1 = m1.test2();
		// System.out.println(result1);
		
		// m1.test3("홍길동");
		/*
			int result2 = m1.sum(10,30);
			System.out.println("sum : " + result2);
		*/
		
		B_Static m2 = new B_Static();
		B_Static m3 = new B_Static();
		
		 m2.test1();
		 m3.test1();
		 B_Static.test1();
		
		
		String result3 = B_Static.test2();
		
		System.out.println(result3);
		
		
		 System.out.println( B_Static.test2() );
		
		 B_Static.test3(100, 200);
		
		 System.out.println( B_Static.sum(15.2, 11.6) );
		
		/*C_Overloading over = new C_Overloading();
		
		over.isZero( 10 );
		over.isZero( 0 );
		// ------------------------
		over.isZero(10.0);
		over.isZero(0.0);
		
		over.sum(10, 4.5);
		over.sum(10.5, 30);
		*/
	}
}














