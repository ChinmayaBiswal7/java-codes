package Day_12;

public class hollow_pyramid {

    public static void main(String args[]) {

        int n = 5;

        for(int row = 1; row <= n; row++) {

            // spaces
            for(int col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }

            // first and last row
            if(row == 1 || row == n) {

                for(int col = 1; col <= 2*row-1; col++) {
                    System.out.print("*");
                }

            } else {

                System.out.print("*");

                // middle spaces
                for(int col = 1; col <= 2*row-3; col++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            System.out.println();
        }
    }
}