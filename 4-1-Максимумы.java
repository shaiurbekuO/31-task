import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int max = 0;
        int count = 0;
        do{
            number = sc.nextInt();
            if(number>max){
                max = number;
                count = 1;
            }else if(number == max && number !=0){
                count++;
            }
        }while(number !=0);
        System.out.println(max+" "+count);
    }
}