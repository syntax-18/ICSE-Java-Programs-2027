import java.util.*;

class Employee
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

        hra = basic * 18 / 100;
        da = basic * 17.45 / 100;
        pf = basic * 8.10 / 100;

        net = basic + hra + da - pf;
        if(age > 50)
            net = net + 5000;

        return net;
    }

    void print()
    {
        System.out.println("\nEmployee Number : " + eno);
        System.out.println("Employee Name   : " + name);
        System.out.println("Age             : " + age);
        System.out.println("Basic Salary    : " + basic);
        System.out.println("Net Salary      : " + calculate());
    }

    public static void main(String args[])
    {
        Employee obj = new Employee();

        obj.accept();
        obj.print();
    }
}