import java.util.*;
class series2 {
    int n;
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = sc.nextInt();
    }
    void s1() {
        int num=1,d=3;
        double sum=0.0;
        for(int i=1;i<=n;i++) {
            int fact=1;
            for(int j=1;j<=d;j++) {
                fact=fact*j;
            }
            sum=sum+(double)num/fact;
            num+=2;
            d+=3;
        }
        System.out.println("The sum of the series1 is " + sum);
    }
    void s2() {
        int num=2,d=4;
        double sum=0.0;
        for(int i=1;i<=n;i++) {
            if(i%2==0) {
                sum=sum-(double)num/d;
                num+=2;
                d+=4;
            } else {
                sum=sum+(double)num/d;
                num+=2;
                d+=4;
            }
        }
        System.out.println("The sum of the series2 is " + sum);
            
    }
    public static void main(String args[]) {
        series2 obj = new series2();
        obj.accept();
        obj.s1();
        obj.s2();
    }
}
