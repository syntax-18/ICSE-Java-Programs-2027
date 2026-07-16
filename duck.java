import java.util.*;

class duck {
    public static void main(String args[]) {
        int n, rev = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        n = sc.nextInt();

        int copy = n;
        String s = Integer.toString(n);

        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '0') {
                c++;
            }
        }

        char chl = s.charAt(0);
        if (chl == '0'&& c > 0) {
            System.out.println("The number is a duck number");
        } else {
            System.out.println("The number is not a duck number");
        }
    }
}