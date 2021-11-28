

public class SalesPerson extends Employee {
	float commission;

	public SalesPerson(String name, String address, int age, boolean gender, int salary, float commission) 
	{
		super(name, address, age, gender, salary);
		this.commission = commission;
	}


	//Getter and Setter for Commission
	public float getCommission() {
		return commission;
	}

	public void setCommission(float commission) {
		this.commission = commission;
	}
	
}
