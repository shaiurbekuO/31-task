class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n/1000;
        int b = (n/100)%10;
        int c = (n/10)%10;
        int d = (n/1)%10;
        System.out.println((b==c)&&(a==d)? "true" : "false");
    }
}