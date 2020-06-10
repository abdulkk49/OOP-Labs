class A { public int a =100; 
		//E e1=new E();
		public void call(){
	//	System.out.println("value of a in E  = "+e1.a);
		E a2=new E();
		System.out.println("hi"+ a2.getafromE());
	} 
}

class B extends A { public int a =80; } 

class C extends B { public int a =60; } 

class D extends C { public int a =40; } 

class E extends D{
	public int a =10;
	public int getafromE(){
		return this.a;
	}
	public void show(){
		int a =0;
		System.out.println("value of a inside show = "+a);
		System.out.println("value of a inside class E = "+this.a);
		System.out.println("value of a inside class D = "+super.a);
		System.out.println("value of a inside Class c = "+ new C().a);
		System.out.println("value of a inside Class B = "+ ((B)this).a);
		// Write Java statements to display the values of
		// all a’s used in this file on System.out
	} 
}


class Ex3Test{
	public static void main(String args[]){
		new E().show(); // This is an example of anonymous object
		A a1 = new E();
		a1.call();
		//D d1 = (D) a1; // what’s wrong with this statement?
	}
}