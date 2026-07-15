class StarPattern3 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {
            for (int sp = 1; sp <= 5 - i; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}