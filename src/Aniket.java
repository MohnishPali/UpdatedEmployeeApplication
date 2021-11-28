
interface Bank {
double gri();

}
class HDFC implements Bank{
public double gri() {
	return 9.7;
}
}
class Axis implements Bank{
public double gri() {
	return 7.6;
}
}

class Aniket {
	public static void main(String [] args) {
HDFC h1=new HDFC();
Axis a1= new Axis();
System.out.println(h1.gri());
System.out.println("Axis Bank rate of interest is =  "+ a1.gri());
}
}

