import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long atomsC = sc.nextLong(), atomsH = sc.nextLong(), atomsO = sc.nextLong();
		System.out.println(Math.min(atomsC/2, Math.min(atomsH/6, atomsO)));
	}
}
