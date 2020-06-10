class A { public int a = 100; } // End of class A 
class B extends A { public int a = 80; } // End of class B 
class C extends B { public int a = 60; } // End of class C 
class D extends C { public int a = 40; } // End of class D 

class E extends D{  
	public int a = 10;  
	public void show(){  
		int a = 0;
		System.out.println("a in function " + a);
		System.out.println("a in E" + this.a);
		System.out.println("a in D" + super.a);
		System.out.println("a in C" + ((C)this).a); //Upcasting
		System.out.println("a in B" + ((B)this).a);// Write Java statements to display the values of 
		System.out.println("a in A" + ((A)this).a);
	}
}
public class Ex3Test {

	public static void main(String[] args) {
		new E().show(); // This is an example of anonymous object   
		A a1 = new E();   
		D d1 = (D) a1;
	}

}
