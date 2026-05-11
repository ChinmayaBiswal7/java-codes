package Day_13;

public class armstrong {
    int sum = 0;
    void check(int n){
        if(n==0){
            return ;
        }
        int temp,nw;
        temp = n;
        nw = temp%10;
        sum = sum +(nw*nw*nw);
        temp = temp/10;
        check(temp);

    }
    void arm(int num) {

        check(num);

        if (sum == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
    public static void main(String args []){
        armstrong a = new armstrong();
        a.arm(153);
    }
}
