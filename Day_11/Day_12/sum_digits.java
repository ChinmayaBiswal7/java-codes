package Day_12;

public class sum_digits {
     int sum = 0;
    void digits(int n){
        if(n==0){
            System.out.println(sum);
            return;
        }
        int temp;
        sum = sum + n%10;
        temp = n/10;
        digits(temp);
    }
    public static void main(String args []){
        int n = 53127;
        sum_digits p = new sum_digits();
        p.digits(n);
    }
}
