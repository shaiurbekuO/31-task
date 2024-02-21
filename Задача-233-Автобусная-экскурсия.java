import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++){
		    int v = sc.nextInt();
		    if(v<=437){
		        System.out.println("Crash "+i);
		        return;
		    }
		}
		System.out.println("No crash");
	}
}
