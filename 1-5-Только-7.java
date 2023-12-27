import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int sum = 0;
	    for(int i=0; i<15; i++){
            int n = sc.nextInt();
	        if(n%7==0){
	            break;
	        }else if(n%10==7){
	            sum +=n;
	            continue;
	        }
	    }System.out.println(sum);
	}
}
