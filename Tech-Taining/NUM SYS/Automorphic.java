import java.util.Scanner;
class Automorphic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num=Integer.parseInt(sc.nextLine());
        System.out.println(automorphic(num)?"Automorphic":"Not automorphic");
    }
    public static boolean automorphic(int n){
        int rem=rememder(n);
        int remOfSq=rememder(n*n);

        return rem==remOfSq;
    }
    public static int rememder(int n){
        int rem=n%10;
        return rem;
    }
}