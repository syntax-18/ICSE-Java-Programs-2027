import java.util.*;

class Magic
{
    public static void main(String args[])
    {   int n, copy, sum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        copy = n;

        while(n > 9)
        {
            sum = 0;

            while(n > 0)
            {
                int digit = n % 10;
                sum = sum + digit;
                n = n / 10;
            }

            n = sum;
        }

        if(n == 1)
            System.out.println(copy + " is a Magic Number.");
        else
            System.out.println(copy + " is Not a Magic Number.");
    }
}