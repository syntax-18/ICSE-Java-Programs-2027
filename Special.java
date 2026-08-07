import java.util.*;

class Special
{
    public static void main(String args[])
    {  int n, copy, d, fact, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        copy = n;

        while(n > 0)
        {
            d= n % 10;
            fact = 1;

            for(int i = 1; i <= d; i++)
            {
                fact = fact * i;
            }

            sum = sum + fact;
            n = n / 10;
        }

        if(sum == copy)
            System.out.println(copy + " is a Special Number.");
        else
            System.out.println(copy + " is Not a Special Number.");
    }
}