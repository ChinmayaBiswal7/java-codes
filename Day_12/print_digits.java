package Day_12;

public class print_digits {
    
    void digits(int n){
        if(n==0){
            return;
        }
        int temp ;
        System.out.println(n%10);
        temp = n/10;
        digits(temp);
    }
    public static void main(String args []){
        int n = 53127;
        print_digits p = new print_digits();
        p.digits(n);
    }
}
