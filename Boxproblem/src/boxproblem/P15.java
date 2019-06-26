package boxproblem;

public class P15 {
public static void main(String[] args)
{
	
	int n=Integer.parseInt(args[0]);

	if(n==1)
	
		System.out.println("1 is neither prime no composite");
	else if(n==0)
		System.out.println("0 is neither prime nor composite");
	else if(n%2==0)
	
		System.out.println("it is prime");
	else
		System.out.println("it is not prime");
	}
}

