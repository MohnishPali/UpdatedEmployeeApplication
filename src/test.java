

import java.util.Scanner;

import fi.util.list.LinkedList;

public class test {
	
	public static void main(String[] args) 
	{
       Scanner objScan = new Scanner(System.in);
       
       LinkedList objLink = new LinkedList();
       
       boolean checkMenue=true;
       
       while(checkMenue) 
       {
    	   System.out.println(" Enter Choice:\n 1.Add Employee \n 2.Display\n 3.Sort \n"
    	   		+ " 4.Save Data \n 5. Load Data \n 6.Exit ");
    	   
   		   int choice1 =  objScan.nextInt();
		switch(choice1)
		{
		
		
		case 1 :
		{
			
			System.out.println("a.Add Manger");
			System.out.println("b.Add Engineer");
			System.out.println("c.Add sales person");
			System.out.println("Enter choice :");
			String choice2= objScan.next();
			
			System.out.println("Enter Name :");
			String name =  objScan.next();
		
			
			System.out.println("Enter Address :");
			String address =  objScan.next();
			
			
			System.out.println("Enter Age :");
			 int age =  objScan.nextInt();
		
			
			System.out.println("Enter Gender :");
			boolean gender =  objScan.nextBoolean();
			
			System.out.println("Enter Salary :");
			int salary =  objScan.nextInt();
		
			switch(choice2)
			{
				case "a":
				{
					
					System.out.println("Enter HRA");
					float hra = objScan.nextFloat();
					
					Manager objManager = new Manager(name,address,age,gender,salary,hra);
					objLink.add(objManager);
					
					
				}
				break;
				case "b":
				{
					System.out.println("Enter OT");
					float ot = objScan.nextFloat();
					
					Engineer objEngineer = new Engineer(name,address,age,gender,salary,ot);
					objLink.add(objEngineer);
				}
				break;
				case "c":
				{

					System.out.println("Enter Comission");
					float comission = objScan.nextFloat();
					
					SalesPerson objSalesPerson = new SalesPerson(name,address,age,gender,salary,comission);
					objLink.add(objSalesPerson);
					
				}
				break;
				
			}
			
		}
		break;
		
		case 2 :
		{
			boolean check=true;
			while(check)
			{
				System.out.println("   a.Display All the Employee");
				System.out.println("   b.Display First Employee");
				System.out.println("   c.Display Last Employee");
				System.out.println("   d.Display Next Employee");
				System.out.println("   e.Display Privious Employee");
				System.out.println("   f.Exit");
				System.out.println("   Enter choice :");
				String choice3= objScan.next(); //for display choice
				
					
			 
			
			switch(choice3)
			{
			   
				case "a" :
				{
					System.out.println("All Employee");
					
					Employee data = (Employee)objLink.getFirst();
				   	  
										
				   	  while(data!=null)
				   	  {
					System.out.println(data);
				   		  data = (Employee)objLink.getNext();
				   		
				   	  }
					
					System.out.println("........................................");
					
				}
				break;
				
				
				case "b" :
				{
					/*
					 * System.out.println("First Employee");
					 * 
					 * Employee data=(Employee)objLink.getFirst();
					 * 
					 * System.out.println(data);
					 * 
					 * System.out.println("........................................");
					 */
					
				}
				break;
				
			}
			
			}
		}
		}
       }
	}
}

