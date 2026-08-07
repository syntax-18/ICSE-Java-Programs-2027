import java.util.*;
class pelemdrom {
    
    public static void main(String args[])
    {
       int n,rev=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
         n=sc.nextInt();
         int copy=n;
         while(n>0)
         {
                int ld=n%10;
                rev=rev*10+ld;
                n=n/10;
         }
         if(rev==copy)
         {
             System.out.println("It is a pelemdrom number");
         }
         else
         {
             System.out.println("It is not a pelemdrom number");
         }
     }
}
