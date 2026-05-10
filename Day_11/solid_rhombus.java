package Day_11;

public class solid_rhombus {
    public static void main(String args []){
        int n = 4;
        for(int row=1;row<=n;row++){
            // spaces
            for(int space=1;space<=n-row;space++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
