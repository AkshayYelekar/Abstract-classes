package abstractWale;

public class suzuki extends car{
	
	boolean rooftop;

	@Override
	public void speed() {
		System.out.println(" suzukichi speed jate 120 paryant");
		
	}

	@Override
	public void performance() {
System.out.println("suzuki mahanje jbrdst performance");
	}
	
	public suzuki()
	{
		super();
		rooftop=false;
	}
	
	public suzuki(int modelno,String color,boolean rooftop)
	{
		super(modelno,color);
		this.rooftop=rooftop;
	}
	
	public void sound()
	{
		System.out.println("dan dana dan");
	}
	
	public String toString()
	{
		return super.toString()+" rooftop "+rooftop;
	}
	
	
	
	
	
	
	
	
	
	
}
