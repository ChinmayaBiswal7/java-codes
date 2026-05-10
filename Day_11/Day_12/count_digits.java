package Day_12;

public class count_digits {
    int count = 0;
    void digits(int n){
        if(n==0){
            System.out.println(count);
            return;
        }
        int temp;
        temp = n/10;
        count ++;
        digits(temp);
    }
    public static void main(String args []){
        int n = 53127;
        count_digits p = new count_digits();
        p.digits(n);
    }
}


