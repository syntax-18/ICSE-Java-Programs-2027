import java.util.*;
class manu
{
    int n,ch,nl;
    int c = 0;
    int sum = 0;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for prime no.,2 for perfect no.,3 for buzz no.");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter a no,:");
                int n=sc.nextInt();
                int c=0;
            for(int i=1;i<=n;i++)
            {  
                 if(n% i==0)
                    {
                        c++;
                    }
                 if(c==2)
                    {
                        System.out.println("Prime no.");
                    }
                 else
                 {
                     System.out.println("not a prime no.");
                     
                 }
                 break;
            }
            case 2:
                System.out.println("Enter a no,:");
                int nl =sc.nextInt();
                int sum=0;
                for(int i=1;i<nl;i++)
                {
                    if(nl%i==0)
                    {
                        sum=sum+i;
                    }
                }
                if(sum==nl)
                {
                    System.out.println("Perfect no.");
                }
                else
                {
                    System.out.println("Not a perfect no.");
                }
                break;
            case 3:
                System.out.println("Enter a no,:");
                int n1=sc.nextInt();
                if(n1%10==0 || n1%7==10)
                {
                    System.out.println("Buzz no.");
                }
                else
                {
                    System.out.println("Not a buzz no.");
                }
    }
    
 }
}