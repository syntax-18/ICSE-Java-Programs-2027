import java.util.*;

class School
{
    String sName;
    int year;
    String board;

    // Non-parameterized Constructor
    School()
    {
        year = 2000;
    }

    // Parameterized Constructor
    School(String name)
    {
        sName = name;
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Board (CBSE/ICSE/STATE/IB): ");
        board = sc.nextLine();
    }

    void display()
    {
        System.out.println("\nSchool Name : " + sName);
        System.out.println("Year Started: " + year);
        System.out.println("Board       : " + board);
    }

    public static void main(String args[])
    {
        School obj = new School("Ryan International School");

        obj.input();
        obj.display();
    }
}