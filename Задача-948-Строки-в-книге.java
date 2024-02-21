import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), n = sc.nextInt();
		System.out.println((n-1)/k+1+" "+((n-1)%k+1));
		
	}
}