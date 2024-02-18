import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt(), r2 = sc.nextInt(), r3 = sc.nextInt();
		if(r1>= r2+r3){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
		
	}
}
