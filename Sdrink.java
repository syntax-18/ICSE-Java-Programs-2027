import java.util.*;

class Sdrink
{
    String namCus;
    int qty;
    double price, amount, discount, fAmount;

    void accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name : ");
        namCus = sc.nextLine();

        System.out.print("Enter Quantity (litres) : ");
        qty = sc.nextInt();

        System.out.print("Enter Price per Litre : ");
        price = sc.nextDouble();
    }

    void calculate(char ch)
    {
        amount = qty * price;

        if(ch == '*')       // Dealer
        {
            if(qty <= 10)
                discount = amount * 10 / 100;
            else if(qty <= 20)
                discount = amount * 15 / 100;
            else
                discount = amount * 20 / 100;
        }
        else if(ch == '$')  // Retailer
        {
            if(qty <= 10)
                discount = amount * 8 / 100;
            else if(qty <= 20)
                discount = amount * 10 / 100;
            else
                discount = amount * 15 / 100;
        }

        fAmount = amount - discount;
    }

    void display()
    {
        System.out.println("\nCustomer Name : " + namCus);
        System.out.println("Quantity      : " + qty + " litres");
        System.out.println("Price/Litre   : " + price);
        System.out.println("Amount        : " + amount);
        System.out.println("Discount      : " + discount);
        System.out.println("Final Amount  : " + fAmount);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Sdrink obj = new Sdrink();

        System.out.println("Press * for Dealer");
        System.out.println("Press $ for Retailer");
        System.out.print("Enter Choice : ");
        char ch = sc.next().charAt(0);

        obj.accept();
        obj.calculate(ch);
        obj.display();
    }
}