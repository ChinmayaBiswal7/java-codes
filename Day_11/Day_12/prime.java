package Day_12;

public class prime {
    int count = 0;
    void find(int n){
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                count ++;
            }
        }
        if(count == 2){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not prime");
        }
    }

    public static void main(String args []){
        prime p = new prime();
        p.find(12);
    }
}
