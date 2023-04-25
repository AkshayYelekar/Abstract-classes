package abstractWale;

public abstract class car {
			
		private String color;
		private int modelno;
		
		public car() 
		{
			this.color="default";
			this.modelno=101;
		}
		
		public car(int modelno,String color)
		{
				this.modelno=modelno;
				this.color=color;
		}
		
		public abstract void speed();
		public abstract void performance();
		
		public car getdetails()
		{
			return this;
		}
		
		public String toString()
		{
			return "model no= "+modelno+" color= "+color;
		}
}
