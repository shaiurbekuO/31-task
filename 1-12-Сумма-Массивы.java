import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
        for(int i=arr.length-1; i>=0; i--){System.out.println(arr[i]);}
    }
}