import java.util.*;
class Armstrong
{
    public static void main(String args[])
    {
       int n,sum=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
         n=sc.nextInt();
         int copy=n;
         while(n>0)
         {
                int ld=n%10;
                sum=sum+(ld*ld*ld);
                n=n/10;
         }
         if(sum==copy)
         {
             System.out.println("It is an Armstrong number");
         }
         else
         {
             System.out.println("It is not an Armstrong number");
         }
     }
 }