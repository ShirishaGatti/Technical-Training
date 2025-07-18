import java.util.Scanner;
class Adam {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(isAdam(n)? "Adam" : "Not Adam");
        sc.close();
    }
    public static boolean isAdam(int n) {
        int sq=n*n;//144
        int rev=reverse(n);   
        System.out.println(rev);
        int square2=rev*rev;  
        return sq == reverse(square2);
    }  
    public static int reverse(int n) {
        int rev=0;
        while(n!=0){
          int  rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
}