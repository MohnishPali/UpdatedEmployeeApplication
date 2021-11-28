
public class Shubhangi {
 
	public static void main(String[] args) {
	 
	String st = "Hello";
	 
	String st2 = new String("Hello");
	 
	String st3 = "Hello";
	 
	String st4 = "hello";
	 
	if(st == st2)
	System.out.println("st EQ st2");
	else
	System.out.println("st NOT EQ st2");
	 
	if(st == st3)
	System.out.println("st EQ st3");
	else
	System.out.println("st NOT EQ st3");
	 
	if(st == st4)
	System.out.println("st EQ st4");
	else
	System.out.println("st NOT EQ st4");
	 
	if(st.equals(st2))
	System.out.println("st EQUALS  st2");
	else
	System.out.println("st NOT EQUALS st2");
	 
	if(st.equalsIgnoreCase(st4))
	System.out.println("st EQUALS  st4");
	else
	System.out.println("st NOT EQUALS st4");
	 
	 
	}
 
}

