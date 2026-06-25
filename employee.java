import java.util.*;
class employee
{
    int eno, age;
    String name;
    double basic;
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Number : ");
        eno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name : ");
        name = sc.nextLine();
        System.out.print("Enter Age : ");
        age = sc.nextInt();
        System.out.print("Enter Basic Salary : ");
        basic = sc.nextDouble();
    }
    double calculate()
    {
        double hra, da, pf, net;
        hra=18.0/100 * basic;
        da=17.45/100 * basic;
        pf=8.10/100 * basic;
        net=basic + hra + da - pf;
        if(age > 50)
            net = net + 5000;
        return net;
    }
    void print()
    {
        System.out.println("\nEno\tName\tAge\tBasic\tNet Salary");
        System.out.println(eno + "\t" + name + "\t" + age + "\t" +
        basic + "\t" + calculate());
    }
    public static void main()
    {
        employee obj = new employee();
        obj.accept();
        obj.print();
    }
}