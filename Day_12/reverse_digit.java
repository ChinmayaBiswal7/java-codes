package Day_12;

public class reverse_digit {
    
    void digits(int n){
        int nw = 0;
        if(n==0){
            System.out.println(nw);
            return;
        }
        int temp;
        nw = nw*10 + n%10 ;
        temp = n/10;
        digits(temp);
    }
    public static void main(String args []){
        int n = 53127;
        reverse_digit p = new reverse_digit();
        p.digits(n);
    }
}
