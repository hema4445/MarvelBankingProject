package MarvelPackage;

class A {

	int a=20;  //instance variable or global variable
	static int d=50; //static variable
	void method1() {
	int b=20;//loacal variable;
	b=30;
	int a=60;
	
	System.out.println("The value of b:"+b); 
	System.out.println("The value of :"+a);
	
	}
	 void method2() {
		 int c=10;
		 a=70;
		 int b = 80;
		 System.out.println("The value of a in method2:"+a);
		 
	 }
}
	
public class DataTypesAndVariables {
	
	public static void main(String[] args) {
	
		A a=new A();
		
		a.method1();
		
		
		
		
		
		
	}

}
