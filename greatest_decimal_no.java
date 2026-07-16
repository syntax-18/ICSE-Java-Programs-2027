import java.util.*;
class greatest_decimal_no {
    public static void main(String args[]) {
        int a,b,GDC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a = sc.nextInt();
        System.out.println("Enter another number");
        b = sc.nextInt();

        int min=Math.min(a,b);
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                GDC = i;
                System.out.println("GDC is"+GDC);
            }
        }
    }
}
