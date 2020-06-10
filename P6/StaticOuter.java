
public class StaticOuter {
	String a = "StaticOuter String";
	static String b = "StaticOuter Static String";
	
	void seeStaticInner(){
//		System.out.println(nonstatic);
//		System.out.println(StaticInner.nonstatic);
		System.out.println("2");
		System.out.println(new StaticInner().nonstatic);
		System.out.println(StaticInner.s);
	}
	
	public static void main(String[] args){
//		System.out.println(s);
		System.out.println("1");
		System.out.println(StaticInner.s);
		
		StaticOuter so = new StaticOuter();
		so.seeStaticInner();
	}
	
	static class StaticInner{
		String nonstatic = "StaticInner nonstatic String";
		static String s = "StaticInner static String";
		
		public static void main(String[] args){
//			System.out.println(nonstatic);
			System.out.println("3");
			System.out.println(s);
			System.out.println(b);
		}
	}
}
