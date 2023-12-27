import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(); 
	    if(n<=0){
	        return;
	    }
	    int min = sc.nextInt();
	    int max = min;
	    for(int i=1; i<n; i++){
	        int num = sc.nextInt();
	        if(num < min){
	            min = num;
	        }
	        if(num > max){
	            max = num;
	        }
	    }
	    System.out.println(min);
		System.out.println(max);
	}
}


