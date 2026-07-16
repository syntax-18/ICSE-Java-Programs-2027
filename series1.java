import java.util.*;
class series1 {
    int n,a;
        double sum=0.0,sum1=0.0;
    void accept() {
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter the  value of n");
          n = sc.nextInt();
          System.out.println("Enter value of a");
          a = sc.nextInt();
    }
    void s1() {
        int num=1,d=2;
        for(int i=1;i<=n;i++) {
            sum=sum+(double)num/d;
            sum+=2;
            d+=2;
        }
        System.out.println("The sum of the series1 is " + sum);
    }
    void s2() {
        int p=1,d=4;
        for(int i=1;i<=n;i++) {
            sum1=sum1+Math.pow(p,2)/d;
            p+=2;
            d+=4;
        }
        System.out.println("The sum of the series2 is " + sum1);
    }
    public static void main(String args[]) {
        series1 obj = new series1();
        obj.accept();
        obj.s1();
        obj.s2();
    }
}
