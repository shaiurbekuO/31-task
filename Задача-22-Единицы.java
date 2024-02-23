import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		while(n>0){
		    a=a+n%2;
		    n=n/2;
		}
		System.out.println(a);
	}
}
