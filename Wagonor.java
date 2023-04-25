package abstractWale;

public class Wagonor extends car{
	
	private int noac;
	
	public void speed() 
	{
			System.out.println("speed of wagoner is 80");
	}
	
	public Wagonor() 
	{
			super();
			noac=2;
	}
	
	public Wagonor(int modelno,String color,int noac)
	{
		super(modelno,color);
		this.noac=noac;
	}
	
	public void comfort()
	{
		System.out.println("this has lot of comfort");
	}

	@Override
	public void performance() {
		System.out.println("changla performance ahe");		
	}
	
	public String toString()
	{
		return super.toString()+" no of ac= "+noac;
	}
}
