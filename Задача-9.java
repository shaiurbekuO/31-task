
class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i = 1;
        String str = "*";
        while(i<=n){
            System.out.println(str.repeat(i));
            i++;
        }
    }
}