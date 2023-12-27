import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt(), b = sc.nextInt();
	    int z = sc.nextInt();
	    int sum = a+b;
	    if(z<=sum){
	        int number = sum - z;
		    System.out.println(number);
	    }else{
	        System.out.println("Impossible");
	    }
	}
}
