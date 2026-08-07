import java.util.*;

class TwistedPrime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int rev = 0;

        while(temp > 0)
        {
            int d = temp % 10;
            rev = rev * 10 + d;
            temp = temp / 10;
        }

        int c = 0;
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
                c++;
        }

        int c1 = 0;
        for(int i = 1; i <= rev; i++)
        {
            if(rev % i == 0)
                c1++;
        }

        if(c == 2 && c1 == 2)
            System.out.println(n + " is a Twisted Prime Number.");
        else
            System.out.println(n + " is Not a Twisted Prime Number.");
    }
}