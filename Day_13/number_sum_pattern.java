package Day_13;

public class number_sum_pattern {
    int n;
    void print(int n){
        if(n==1){
            System.out.println("1 = 1");
        }
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=row;col++){
            System.out.print(col);
            if(col==row){
                System.out.print("=");
            }
            else{
                System.out.print("+");
            }
            }
            System.out.print((row*(row+1))/2);
            System.out.println();
            
        }
    }
    public static void main(String args []){
        number_sum_pattern ns = new number_sum_pattern();
        ns.print(5);
    }
}
