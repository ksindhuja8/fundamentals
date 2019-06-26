package boxproblem;
public class P19 {
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
int t=1,k=5,i=0;
while(t!=0)
{
	for(i=0;i<n;i++)
	{
		if(i%5==0&&i%2==0&&i%3==0)
		{
			System.out.println(i);
		}	
	}
	t--;
}
}
}