import java.util.*;
class happy {
    public static void main(String args[]) {
        int n, sum = 0, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");  
        n = sc.nextInt();
        int copy = n;
        while (n!=1&& n!=4) {
            sum = 0;
            while (n>0) {
                d = Math.abs(n % 10);
                sum = sum + (d*d);
                n = n/10;
            }
            n = sum;
        }
        if (n == 1) {
            System.out.println(copy + " is a happy number");
        } else {
            System.out.println(copy + " is not a happy number");
        }
    }
}
