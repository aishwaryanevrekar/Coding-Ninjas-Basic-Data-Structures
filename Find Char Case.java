import java.util.Scanner;
public class Main 
{

	public static void main(String[] args) 
	{
		Scanner c=new Scanner(System.in);
		String str=c.next();
		char a=str.charAt(0);
		if(a>=97 && a<=122)
		{
			System.out.println("0");
		}else
		if(a>=65 && a<=90)
		{
			System.out.println("1");
		}else
		{
			System.out.println("-1");
		}
	}

}