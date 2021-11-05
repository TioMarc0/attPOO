package posto;

public class bombaDiesel extends bomba {
	
	private double diesel;
	
	public bombaDiesel(String posto, double quant, double preco, double Lvendidos, double diesel) {
	super ();
		setDiesel(diesel);
	}
	
	public bombaDiesel() {
		
	}
	
	public double getDiesel() {
		return diesel;
	}

	public void setDiesel(double diesel) {
		this.diesel = diesel;
	}

	@Override
	public String toString() {
		return "bombaDiesel [diesel=" + diesel + "]";
	}
	
}