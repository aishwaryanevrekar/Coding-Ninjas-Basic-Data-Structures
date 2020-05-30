import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int x,n;
	 x=s.nextInt();
	 n=s.nextInt();
	
 

        long y = 1;

        while (n != 0)
        {
            y *= x;
            --n;
        }

        System.out.println(y);
    }

	}