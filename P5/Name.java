//import java.util.StringTokenizer;
public class Name {
	private String fname;
	private String mname;
	private String lname;
	
	Name(String name){
		String[] names = name.split("[,;]+");
		if(name.contains(",")){
			fname = names[0];
			mname = names[1];
			lname = names[2];
		}
		else{
			fname = names[2];
			mname = names[1];
			lname = names[0];
		}
	}
	
	public String getFname(){
		return fname;
	}
	
	public String getLname(){
		return lname;
	}
	
	public String getMname(){
		return mname;
	}
	
	public String getName(){
		return fname + " " + mname + " " + lname;
	}
	
	public String toString(){
		return fname+mname+lname;
	}
}
