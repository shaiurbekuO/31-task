import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		int c = sc.nextInt(), t = sc.nextInt();
		if(a>=t)
		    System.out.println(t*b);
		else
		    System.out.println((t-a)*c+a*b);
	}
}
