

import java.util.Scanner;

public class Entry {
	public static void main(String[] args) 
	{
       try (Scanner objScan = new Scanner(System.in);){
		
		   
		   int Max=100;
		   Employee objEmployee [] = new Employee[Max];
		   
		   int count=0;
		  
		   int counter=0;
		   
		   boolean checkMenue=true;
		   
		   while(checkMenue) 
		   {
			   System.out.println(" 1.Add Employee \n 2.Display\n 3.Sort\n 4.Save Data \n 5. Load Data \n 6.Exit\n Enter Choice:");
			   
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
						objEmployee[count]= new Manager(name,address,age,gender,salary,hra);
						
						count++;
					}
					break;
					case "b":
					{
						System.out.println("Enter OT");
						float ot = objScan.nextFloat();
						objEmployee[count]= new Manager(name,address,age,gender,salary,ot);
						
						count++;
					}
					break;
					case "c":
					{

						System.out.println("Enter Commission");
						float comission = objScan.nextFloat();
						
						objEmployee[count]= new Manager(name,address,age,gender,salary,comission);
						count++;
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
					String choice3= objScan.next();
					
						
				while(choice3!="f")	
				{
				
				switch(choice3)
				{
				   
					case "a" :
					{
						System.out.println("All Employee");
						for(int itmp=0;itmp<count;itmp++)
						{
							
							DisplayDetailas(objEmployee, itmp);	
							
							if (objEmployee[itmp] instanceof Manager)
							{
								Manager objManager = (Manager) objEmployee[itmp] ;
								
								System.out.println("Hra is "+objManager.getHra());
							}
							else if (objEmployee[itmp] instanceof Engineer)
							{
								Engineer objEngineer = (Engineer) objEmployee[itmp] ;
								
								System.out.println("OT is "+objEngineer.getOt());
							}
							else if (objEmployee[itmp] instanceof SalesPerson)
							{
								SalesPerson objSalesPerson = (SalesPerson) objEmployee[itmp] ;
								System.out.println("HRA is "+objSalesPerson.getCommission());
							}
							System.out.println("........................................");
						}
					}
					break;
					
					case "b" :
					{
						int itmp=0;
						
						DisplayDetailas(objEmployee, itmp);	
						if (objEmployee[itmp] instanceof Manager)
						{
							Manager objManager = (Manager) objEmployee[itmp] ;
							System.out.println("Hra is "+objManager.getHra());
						}
						else if (objEmployee[itmp] instanceof Manager)
						{
							Engineer objEngineer = (Engineer) objEmployee[itmp] ;
							System.out.println("OT is "+objEngineer.getOt());
						}
						else if (objEmployee[itmp] instanceof Manager)
						{
							SalesPerson objSalesPerson = (SalesPerson) objEmployee[itmp] ;
							System.out.println("HRA is "+objSalesPerson.getCommission());
						}
						System.out.println("........................................");
						
						counter++;
					}
					break;
					case "c" :
					{
						counter=count-1;
						
						int itmp=count-1;
						
						DisplayDetailas(objEmployee, itmp);	
						if (objEmployee[itmp] instanceof Manager)
						{
							Manager objManager = (Manager) objEmployee[itmp] ;
							System.out.println("Hra is "+objManager.getHra());
						}
						else if (objEmployee[itmp] instanceof Engineer)
						{
							Engineer objEngineer = (Engineer) objEmployee[itmp] ;
							System.out.println("OT is "+objEngineer.getOt());
						}
						else if (objEmployee[itmp] instanceof SalesPerson)
						{
							SalesPerson objSalesPerson = (SalesPerson) objEmployee[itmp] ;
							System.out.println("HRA is "+objSalesPerson.getCommission());
						}
						
						System.out.println("........................................");
						//objEmployee[count].Dispaly();
					}
					break;
					case "d" :
					if(counter!=count-1)
					{
						int itmp=counter+1;
						
						System.out.println("");
						DisplayDetailas(objEmployee, itmp);	
						
						if (objEmployee[itmp] instanceof Manager)
						{
							Manager objManager = (Manager) objEmployee[itmp] ;
							System.out.println("Hra is "+objManager.getHra());
						}
						else if (objEmployee[itmp] instanceof Engineer)
						{
							Engineer objEngineer = (Engineer) objEmployee[itmp] ;
							System.out.println("OT is "+objEngineer.getOt());
						}
						else if (objEmployee[itmp] instanceof SalesPerson)
						{
							SalesPerson objSalesPerson = (SalesPerson) objEmployee[itmp];
							System.out.println("HRA is "+objSalesPerson.getCommission());
						}
						System.out.println("........................................");
						//objEmployee[counter+1].Dispaly();
						counter++;
					}
					else
					{
						return;
					}
					break;
					case "e" :
					{
						int itmp=counter-1;
						
						DisplayDetailas(objEmployee, itmp);	
						if (objEmployee[itmp] instanceof Manager)
						{
							Manager objManager = (Manager) objEmployee[itmp] ;
							System.out.println("Hra is "+objManager.getHra());
						}
						else if (objEmployee[itmp] instanceof Engineer)
						{
							Engineer objEngineer = (Engineer) objEmployee[itmp] ;
							System.out.println("OT is "+objEngineer.getOt());
						}
						else if (objEmployee[itmp] instanceof SalesPerson )
						{
							SalesPerson objSalesPerson = (SalesPerson) objEmployee[itmp] ;
							System.out.println("Commision is "+objSalesPerson.getCommission());
						}
						System.out.println("........................................");
						//objEmployee[counter-1].Dispaly();
						
						counter--;
					}
					break;
					case "f" :
					{
						check=false;
					}break;
				
				  	}
					break;
					}
					}
				
				
			}
		    break;
			
			case 3 :
			{
				System.out.println("  a. All Manager ");
				System.out.println("  b. AllEngineer");
				System.out.println("  c. All Sales Person");
				System.out.println("  d. All Employees Ascending Order ");
				System.out.println("  Entetr Choice");
				
				String choice4=objScan.next();
				
				switch(choice4)
				{
				case "a" :
				{
					for(int itmp=0;itmp<count;itmp++)
					{	
						if (objEmployee[itmp] instanceof Manager)
						{
							
							DisplayDetailas(objEmployee, itmp);	
							
							Manager objManager = (Manager) objEmployee[itmp] ;
							
							System.out.println("Hra is "+objManager.getHra());
							System.out.println("........................................");
						}
					}
				}
				break;
				
				case "b" :
				{
					for(int itmp=0;itmp<count;itmp++)
					{	
						if (objEmployee[itmp] instanceof Engineer)
						{
							
							DisplayDetailas(objEmployee, itmp);	
							
							Engineer objEngineer = (Engineer) objEmployee[itmp] ;
							
							System.out.println("OT is "+objEngineer.getOt());
							System.out.println("........................................");
						}
					}
				}
				break;
				
				case "c" :
				{
					for(int itmp=0;itmp<count;itmp++)
					{	
						if (objEmployee[itmp] instanceof SalesPerson)
						{
							
							DisplayDetailas(objEmployee, itmp);	
							
							SalesPerson objSalesPerson = (SalesPerson) objEmployee[itmp] ;
							System.out.println("Commision is "+objSalesPerson.getCommission());
							System.out.println("........................................");
						}
					}
				}
				break;
				
				}	
				
			}break;
			
			
			case 4 :
			{
			  checkMenue=false;
			}
		}
		
}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
       System.out.println("APPLICATION IS CLOSED");
}

	
	
	
/**
 * @param objEmployee
 * @param itmp
 */
private static void DisplayDetailas(Employee[] objEmployee, int itmp) {
	System.out.println("Details are as fallows :");
	System.out.println("Name:"+objEmployee[itmp].getName());
	System.out.println("Address :"+objEmployee[itmp].getAddress());
	System.out.println("Age"+objEmployee[itmp].getAge());
	System.out.println("Gender"+objEmployee[itmp].isGender());
	System.out.println("salary"+objEmployee[itmp].getSalary());
}

}
