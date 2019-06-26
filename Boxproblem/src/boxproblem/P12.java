package boxproblem;

public class P12 {
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int c=0;
		for(int i=1;i<=n;i++)
		{
		if(n%i==0)
			c++;
		}
		if(c==2)
			System.out.println("number is Prime");
		else
			System.out.println("it is not prime");
	}

}
