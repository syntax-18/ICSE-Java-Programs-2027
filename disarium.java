import java.util.*;
class disarium {
    public static void main(String args[]) {
        int  n; double sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
        int copy = n;
        String s=" ";
        s= Integer.toString(n);
        int l = s.length();
        while(n>0)
        {
            int ld = n%10;
            sum = sum + Math.pow(ld,l);
            n = n/10;
            l--;
        }
        if(sum==copy)
        {
            System.out.println("The number is a Disarium number.");
        }
        else
        {
            System.out.println("The number is not a Disarium number.");
        }
    }
}