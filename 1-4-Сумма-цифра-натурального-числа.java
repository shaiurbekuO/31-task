import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum = 0;
	    int summa = 0;
	    while(n>0){
	        sum = n%10;
	        summa += sum;
	        n /= 10;
	    }System.out.println(summa);
	}
}
