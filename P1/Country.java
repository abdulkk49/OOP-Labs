public class Country{	
	private String name;
	private String capital;
	private long population;
	public Country(String name){
		this.name = name;
	}
	
	public String getName(){ return name; }
	
	public void setName(String name) {this.name = name;}
	
	public String getCapital() {return capital;}
	
	public void setCapital(String capital) {this.capital = capital;}
	
	public long getPopulation() { return population; }
	
	public void setPopulation(long population) {this.population = population; }
	@Override
	
	public String toString() {
		return "Country [name="+name + " capital=" + capital + " ,population=" + population +"]";
	}
	
	public static void main(String args[]){
		Country me = new Country("India");
		me.setCapital("New Delhi");
		me.setPopulation(1200000000);
		System.out.println(me);
	}
}
