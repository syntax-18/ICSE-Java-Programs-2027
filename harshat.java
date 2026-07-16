import java.util.*;
class harshat {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        int copy = n;
        int sum = 0;
        while (n>0) {
           int ld=n%10;
           sum=sum+ld;
           n=n/10;
        }
        if (copy%sum==0) {
            System.out.println(copy + " is a harshad number");
        } else {
            System.out.println(copy + " is not a harshad number");
        }
    }
}
