

public class Engineer extends Employee {
float ot;
	
	public Engineer(String name, String address, int age, boolean gender, int salary, float ot) 
	{
		super(name, address, age, gender, salary);
		this.ot = ot;
	}

	//Getter and Setter for the OT
	public float getOt() 
	{
		return ot;
	}
	
	public void setOt(float ot) 
	{
		    try {
				if(ot>0)
				throw new Exception();
				this.ot = ot;
			} catch (Exception e) {
				
				System.out.println("Invalid Input");
			}
		
		
	}

}
