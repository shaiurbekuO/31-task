import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%3==0){
		    System.out.println("GCV");
		}else if(n%3==1){
		    System.out.println("VGC");
		}else{System.out.println("CVG");}
	}
}
