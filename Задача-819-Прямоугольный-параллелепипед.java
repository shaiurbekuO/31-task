import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();
		long sum1 = 2*(a*b+b*c+c*a);
		System.out.println(sum1+" "+a*b*c);
		
	}
}
