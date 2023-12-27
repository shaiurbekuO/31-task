import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt(), h = sc.nextInt(), r = sc.nextInt();
		if(2 * r <= Math.min(w, h)){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
		
	}
}
