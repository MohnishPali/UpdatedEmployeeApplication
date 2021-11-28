

public abstract class  Employee {
	//Comman Parameters
    String name;
    
    String address;
    
    int age ;
    
    boolean gender;
    
    int salary;
    
   // Construct to set Comman Parameters
	public Employee(String name, String address, int age, boolean gender, int salary) 
	{
		
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name)
	{ 
		if( name != null)
		{
			this.name = name;
			
		}
		else
			System.out.println("Invalid Input");
			
	}
	
	//Getter and Setter for Address

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) 
	{
		if( address != null)
		{
			this.address = address;
			
		}
		else
			System.out.println("Invalid Input");
		
	}

	//Getter and Setter for age
	public int getAge() {
		return age;
	}

	public void setAge(int age) 
	{ 
		this.age = age;
	}

	//Getter and Setter for Gender
	public boolean isGender() 
	{
		return gender;
	}

	public void setGender(boolean gender) 
	{
		this.gender = gender;
	}

	
	//Salary validation 
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary)
	{
		if(salary<=0)
		{
			System.out.println("Invalid Input");
		}
		else
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		return "Name : " + getName() + ", Address :" + getAddress() + ",Age :" + getAge();
	}
    
}
