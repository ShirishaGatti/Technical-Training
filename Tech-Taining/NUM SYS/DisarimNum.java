import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(disarium(num) ? "disarium" : "not a disarium");
    }

    // Function to check if a number is a Disarium number
    public static boolean disarium(int num) {
        int digits = countDigits(num); // Total digits
        int temp = num;
        int res = 0;

        while (temp > 0) {
            int rem = temp / (int)Math.pow(10, digits - 1); // Get the leftmost digit
            res += Math.pow(rem, countDigits(num) - digits + 1); // Raise to position
            temp = temp % (int)Math.pow(10, digits - 1); // Remove the leftmost digit
            digits--;
        }

        return res == num;
    }

    // Helper to count number of digits
    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
