package boxproblem;

public class P14 {
public static void main(String[] args)
{
	int n=Integer.parseInt(args[0]);
int sum=0,r;
	while(n!=0)
	{
		r=n%10;
		sum=sum+r;
		n=n/10;
	
	}
	System.out.println(" sum of the digits "+sum);
}
}
