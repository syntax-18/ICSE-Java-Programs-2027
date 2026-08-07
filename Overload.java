import java.util.*;

class Overload
{
    
    void print()
    {
        int num = 1;

        for(int i = 1; i <= 3; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

 
    boolean print(int n)
    {
        int temp = n;
        int sum = 0;

        while(temp > 0)
        {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        if(sum * sum * sum == n)
            return true;
        else
            return false;
    }

   
    void print(int a, char ch)
    {
        if(ch == 'S' || ch == 's')
            System.out.println("Square = " + (a * a));

        else if(ch == 'C' || ch == 'c')
            System.out.println("Cube = " + (a * a * a));

        else
            System.out.println("Invalid Choice");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Overload obj = new Overload();

       
        System.out.println("Pattern:");
        obj.print();

     
        System.out.print("\nEnter a number: ");
        int n = sc.nextInt();

        if(obj.print(n))
            System.out.println(n + " is a Dudeney Number.");
        else
            System.out.println(n + " is Not a Dudeney Number.");

        
        System.out.print("\nEnter a number: ");
        int a = sc.nextInt();

        System.out.print("Enter S for Square or C for Cube: ");
        char ch = sc.next().charAt(0);

        obj.print(a, ch);
    }
}