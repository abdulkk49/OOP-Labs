
class outer{
	Inner i1 = new Inner();
	private String s = "Outer String";
	
	void getS(){
		System.out.println(s);
	}
	
	void getInnerS(){
		System.out.println(i1.s);
	}
	class Inner{
		private String s = "Inner String";
		void getS(){
			System.out.println(s);
		}
		
		void getOuterS(){
			System.out.println(outer.this.s);
		}
	}
	
	public static void main(String[] args){
		outer o = new outer();
		outer.Inner oi = o.new Inner();
		o.getS();
		oi.getS();
		o.getInnerS();
		oi.getOuterS();
	}
}
