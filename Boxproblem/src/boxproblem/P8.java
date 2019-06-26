package boxproblem;

public class P8 {
public static void main(String[] args)
{
	char colour=args[0].charAt(0);
	switch(colour)
	{
	case 'R':System.out.println("Red");
	break;
	case 'B':System.out.println("Blue");
	break;
	case 'G':System.out.println("Green");
	break;
	case 'O':System.out.println("Orange");
	break;
	case 'Y':System.out.println("Yellow");
	break;
	case 'W':System.out.println("white");
	break;
	default:System.out.println("invalid colour");
	break;
	}
}
}
