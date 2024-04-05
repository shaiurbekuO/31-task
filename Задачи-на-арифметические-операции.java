import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int sum = n/k;
		int sum2 = n%k;
		System.out.println(sum+" "+sum2);
	}
}