import java.util.*;
class simple  {
    public static void main(String args[]) {
        int n,count=0;
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter a number");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(n + " is a simple number");
        } else {
            System.out.println(n + " is not a simple number");
        }
    }
}
