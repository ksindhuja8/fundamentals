package boxproblem;
public class P18 {
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
int s,r,rev=0;
s=n;
while(n!=0)
{
	r=n%10;
	rev=rev*10+r;
	n=n/10;
}
if(s==rev)
	System.out.println("palindrome");
else
	System.out.println("not palindrome");
}
}
