


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
public class ADIT
{



		public static void main(String[] args)
		{
			File ref = new File("E:\\File1.txt");
			
			try
			{
				FileInputStream obj = new FileInputStream(ref);
				int num=(int)ref.length();
				byte []arr= new byte[num];
				obj.read(arr);
				String s1 = new String(arr);
				
				
				System.out.println(s1);
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

