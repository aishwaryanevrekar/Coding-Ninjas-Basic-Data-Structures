import java.util.Scanner;
public class Solution
{
	public static void main(String[] args)
	{
		Scanner a=new Scanner(System.in);
		int S=a.nextInt();
		int E=a.nextInt();
		int W=a.nextInt();
		int c;
		while(S<=E)
		{
			c=(5*(S-32))/9;
			System.out.println(S+"\t"+c);
			S=S+W;
		}
	}
}